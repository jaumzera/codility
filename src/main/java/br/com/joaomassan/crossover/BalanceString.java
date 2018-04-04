package br.com.joaomassan.crossover;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BalanceString {

    /**
     * Consider a string expression consisting of the characters < and > only. We consider the string to be balanced if each < always appears before (i.e., to the left of) a corresponding > character (they do not need to be adjacent). Moreover, each < and > act as a unique pair of symbols and neither symbol can be considered as part of any other pair of symbols. For example, the strings <<>>, <>, and <><> are all balanced, but the strings >>, <<>, and ><>< are unbalanced.
     * To balance a string, we can replace only > character with <> at most maxReplacement times. Given an expression and the value of maxReplacement, can you turn an unbalanced string into a balanced one?
     * Complete the balancedOrNot function in the editor below. It has the following parameters:
     * An array of n strings, expressions, denoting the list of expressions to check.
     * An array of n integers, maxReplacements, where maxReplacementsi denotes the maximum number of replacements allowed when attempting to balance expressionsi.
     * The function must return an array of integers where each index i (0 ≤ i < n) contains a 1 if expressionsi is balanced or a 0 if it is not.
     *
     * @param expressions
     * @param maxReplacements
     * @return
     */

    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {

        class Expression {
            private String expression;
            private final int maxReplacements;
            private int replacements;

            Expression(String expression, int maxReplacements) {
                this.expression = expression;
                this.maxReplacements = maxReplacements;
            }

            int getReplacements() {
                return replacements;
            }

            void balance() {
                //while (expression.matches("^.*>>.*$") && replacements < maxReplacements) {
                while (expression.matches("^.*>>.*$")) {
                    expression = expression.replaceFirst(">>", "><>");
                    replacements++;
                }
            }

            boolean isBalanced() {
                if (expression.endsWith("<")) {
                    return false;
                } else if (replacements > maxReplacements) {
                    return false;
                } else {
                    Set<String> items = new HashSet<>();
                    Arrays.stream(expression.split("")).forEach(item -> {
                        if (items.contains(item)) {
                            items.remove(item);
                        } else {
                            items.add(item);
                        }
                    });
                    return items.size() % 2 == 0;
                }
            }
        }

        int[] result = new int[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            Expression exp = new Expression(expressions[i], maxReplacements[i]);
            if (exp.isBalanced()) {
                result[i] = 1;
            } else {
                exp.balance();
                result[i] = exp.isBalanced() && exp.getReplacements() <= maxReplacements[i] ? 1 : 0;
            }
        }

        return result;
    }
}
