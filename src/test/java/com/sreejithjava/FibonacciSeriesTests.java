// java
package com.sreejithjava;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Description;

@Epic("Fibonacci Series Tests")
public class FibonacciSeriesTests {
    @Feature("Series Output")
    @Story("Header and series are printed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies the main prints header and the first 10 Fibonacci numbers in order")
    @org.junit.jupiter.api.Test
    void fibonacciMainPrintsHeaderAndSeries() throws Exception {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream old = System.out;
        System.setOut(ps);
        try {
            com.sreejithjava.BasicPrograms.FibonacciSeries.main(new String[] {});
        } finally {
            System.setOut(old);
        }
        String output = new String(baos.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);
        org.junit.jupiter.api.Assertions.assertTrue(output.startsWith("Fibonacci Series up to 10 terms:"),
            "Expected header to start the output");
        org.junit.jupiter.api.Assertions.assertTrue(output.contains("0, 1, 1, 2, 3, 5, 8, 13, 21, 34"),
            "Expected Fibonacci sequence for 10 terms to appear in output");
    }

    @Feature("Series Output")
    @Story("Exact numeric terms for default run")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ensures the program outputs exactly ten numeric Fibonacci terms when run without args")
    @org.junit.jupiter.api.Test
    void fibonacciMainProducesExactlyTenNumericTerms() throws Exception {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream old = System.out;
        System.setOut(ps);
        try {
            com.sreejithjava.BasicPrograms.FibonacciSeries.main(new String[] {});
        } finally {
            System.setOut(old);
        }
        String output = new String(baos.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);

        // Process backspace characters as a terminal would
        StringBuilder sb = new StringBuilder();
        for (char c : output.toCharArray()) {
            if (c == '\b') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        String processed = sb.toString();

        // Extract the line after the header
        int idx = processed.indexOf(System.lineSeparator());
        String numbersLine = (idx >= 0) ? processed.substring(idx + System.lineSeparator().length()).trim() : processed.trim();

        String[] tokens = java.util.Arrays.stream(numbersLine.split(","))
            .map(String::trim)
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);

        String[] expected = new String[] { "0", "1", "1", "2", "3", "5", "8", "13", "21", "34" };
        org.junit.jupiter.api.Assertions.assertArrayEquals(expected, tokens, "Expected exactly the 10 Fibonacci terms");
    }

    @Feature("Series Output")
    @Story("Valid Fibonacci sequence")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validates that each term after the first two is the sum of the two preceding terms")
    @org.junit.jupiter.api.Test
    void fibonacciMainGeneratesValidFibonacciSequence() throws Exception {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream old = System.out;
        System.setOut(ps);
        try {
            com.sreejithjava.BasicPrograms.FibonacciSeries.main(new String[] {});
        } finally {
            System.setOut(old);
        }
        String output = new String(baos.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);

        // Process backspace characters
        StringBuilder sb = new StringBuilder();
        for (char c : output.toCharArray()) {
            if (c == '\b') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        String processed = sb.toString();
        int idx = processed.indexOf(System.lineSeparator());
        String numbersLine = (idx >= 0) ? processed.substring(idx + System.lineSeparator().length()).trim() : processed.trim();

        java.util.List<Integer> values = new java.util.ArrayList<>();
        for (String tok : numbersLine.split(",")) {
            String t = tok.trim();
            if (!t.isEmpty()) values.add(Integer.parseInt(t));
        }

        org.junit.jupiter.api.Assertions.assertEquals(10, values.size(), "Expected 10 terms");
        for (int i = 2; i < values.size(); i++) {
            org.junit.jupiter.api.Assertions.assertEquals(values.get(i - 1) + values.get(i - 2), values.get(i),
                "Each term after the first two must be the sum of the previous two");
        }
    }

    @Feature("Series Output")
    @Story("No trailing comma in output")
    @Severity(SeverityLevel.MINOR)
    @Description("Checks there is no trailing comma after backspace characters are processed from the output")
    @org.junit.jupiter.api.Test
    void fibonacciMainOutputHasNoTrailingCommaAfterBackspaceProcessing() throws Exception {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream old = System.out;
        System.setOut(ps);
        try {
            com.sreejithjava.BasicPrograms.FibonacciSeries.main(new String[] {});
        } finally {
            System.setOut(old);
        }
        String output = new String(baos.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);

        StringBuilder sb = new StringBuilder();
        for (char c : output.toCharArray()) {
            if (c == '\b') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        String processed = sb.toString();
        int idx = processed.indexOf(System.lineSeparator());
        String numbersLine = (idx >= 0) ? processed.substring(idx + System.lineSeparator().length()) : processed;
        numbersLine = numbersLine.replaceAll("\\s+$", ""); // trim trailing whitespace only

        org.junit.jupiter.api.Assertions.assertFalse(numbersLine.endsWith(","), "Output should not end with a comma after backspace processing");
    }
}