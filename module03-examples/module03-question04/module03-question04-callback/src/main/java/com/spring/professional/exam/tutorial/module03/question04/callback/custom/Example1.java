package com.spring.professional.exam.tutorial.module03.question04.callback.custom;

import com.spring.professional.exam.tutorial.module03.question04.callback.custom.evaluator.NumbersEvaluator;
import com.spring.professional.exam.tutorial.module03.question04.callback.custom.expression.AddExpressionEvaluator;
import com.spring.professional.exam.tutorial.module03.question04.callback.custom.expression.ExpressionEvaluator;
import com.spring.professional.exam.tutorial.module03.question04.callback.custom.expression.MinusExpressionEvaluator;
import com.spring.professional.exam.tutorial.module03.question04.callback.custom.printer.DecoratedValuePrinter;
import com.spring.professional.exam.tutorial.module03.question04.callback.custom.printer.StandardValuePrinter;
import com.spring.professional.exam.tutorial.module03.question04.callback.custom.printer.ValuePrinter;

public class Example1 {
    public static void main(String[] args) {
        new Example1().run();
    }

    private void run() {
//        ExpressionEvaluator expressionEvaluator = new AddExpressionEvaluator();

        // Anonymous class e.g.
//        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator() {
//            @Override
//            public int evaluate(int a, int b) {
//                return a * b;
//            }
//        };

//        ExpressionEvaluator expressionEvaluator = new MinusExpressionEvaluator();
//        ExpressionEvaluator expressionEvaluator = (a, b) -> a + b; // ExpressionEvaluator is FunctionalInterface
        //ExpressionEvaluator expressionEvaluator = (a, b) -> a - b;
        ExpressionEvaluator expressionEvaluator = this::powEvaluator;
//        ExpressionEvaluator expressionEvaluator = Integer::sum; // same as (a, b) -> a + b

//        ValuePrinter valuePrinter = new StandardValuePrinter();
        ValuePrinter valuePrinter = new DecoratedValuePrinter();

        NumbersEvaluator numbersEvaluator = new NumbersEvaluator();

        numbersEvaluator.evaluate(4, expressionEvaluator, valuePrinter);
    }

    private int powEvaluator(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
