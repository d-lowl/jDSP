/*
 * Copyright (c) 2020 Sambit Paul
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.psambit9791.jdsp;

import com.github.psambit9791.jdsp.misc.UtilMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class TestUtils {

    @Test
    public void linspaceSingleTest() {
        double[] result1 = {2.0, 2.25, 2.50, 2.75, 3.0};
        double[] out1 = UtilMethods.linspace(2, 3, 5, true);
        Assertions.assertArrayEquals(result1, out1, 0.001);

        double[] result2 = {2.0, 2.2, 2.4, 2.6, 2.8};
        double[] out2 = UtilMethods.linspace(2, 3, 5, false);
        Assertions.assertArrayEquals(result2, out2, 0.001);
    }

    @Test
    public void linspaceRepeatTest() {
        double[] result = {2.0, 2.25, 2.50, 2.75, 3.0, 2.0, 2.25, 2.50, 2.75, 3.0};
        double[] out = UtilMethods.linspace(2, 3, 5, 2);
        Assertions.assertArrayEquals(result, out, 0.001);
    }

    @Test
    public void arangeDoubleTest() {
        double[] result1 = {3.0, 5.0, 7.0};
        double[] out1 = UtilMethods.arange(3.0, 9.0, 2.0);
        Assertions.assertArrayEquals(result1, out1, 0.001);

        double[] result2 = {3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5};
        double[] out2 = UtilMethods.arange(3.0, 9.0, 0.5);
        Assertions.assertArrayEquals(result2, out2, 0.001);
    }

    @Test
    public void arangeIntTest() {
        int[] result = {3, 5, 7};
        int[] out = UtilMethods.arange(3, 9, 2);
        Assertions.assertArrayEquals(result, out);
    }

    @Test
    public void reverseDoubleTest() {
        double[] signal = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = {6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        double[] out = UtilMethods.reverse(signal);
        Assertions.assertArrayEquals(result, out, 0.0);
    }

    @Test
    public void reverseIntTest() {
        int[] signal = {1, 2, 3, 4, 5, 6};
        int[] result = {6, 5, 4, 3, 2, 1};
        int[] out = UtilMethods.reverse(signal);
        Assertions.assertArrayEquals(result, out);
    }

    @Test
    public void concatenateDoubleTest() {
        double[] arr1 = {1.0, 2.0};
        double[] arr2 = {3.0, 4.0, 5.0, 6.0};
        double[] result = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] out = UtilMethods.concatenateArray(arr1, arr2);
        Assertions.assertArrayEquals(result, out, 0.0);
    }

    @Test
    public void concatenateIntTest() {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4, 5, 6};
        int[] result = {1, 2, 3, 4, 5, 6};
        int[] out = UtilMethods.concatenateArray(arr1, arr2);
        Assertions.assertArrayEquals(result, out);
    }

    @Test
    public void splitByIndexDoubleTest() {
        double[] signal = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = {3.0, 4.0};
        double[] out = UtilMethods.splitByIndex(signal, 2, 4);
        Assertions.assertArrayEquals(result, out, 0.0);
    }

    @Test
    public void splitByIndexIntTest() {
        int[] signal = {1, 2, 3, 4, 5, 6};
        int[] result = {3, 4};
        int[] out = UtilMethods.splitByIndex(signal, 2, 4);
        Assertions.assertArrayEquals(result, out);
    }

    @Test
    public void pseudoInverseTest() {
        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] result = {{-0.639, -0.167, 0.306}, {-0.056, 0.000, 0.056}, {0.528, 0.167, -0.194}};
        double[][] out = UtilMethods.pseudoInverse(matrix);
        Assertions.assertArrayEquals(result[0], out[0], 0.001);
        Assertions.assertArrayEquals(result[1], out[1], 0.001);
        Assertions.assertArrayEquals(result[1], out[1], 0.001);
    }

    @Test
    public void padSignalTest() {
        double[] signal = {2, 8, 0, 4, 1, 9, 9, 0};
        double[] reflect = {0, 9, 9, 1, 4, 0, 8, 2, 2, 8, 0, 4, 1, 9, 9, 0, 0, 9, 9, 1, 4, 0, 8, 2};
        double[] constant = {0, 0, 0, 0, 0, 0, 0, 0, 2, 8, 0, 4, 1, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0.};
        double[] nearest = {2, 2, 2, 2, 2, 2, 2, 2, 2, 8, 0, 4, 1, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0.};
        double[] mirror = {9, 0, 9, 9, 1, 4, 0, 8, 2, 8, 0, 4, 1, 9, 9, 0, 9, 9, 1, 4, 0, 8, 2, 8};
        double[] wrap = {2, 8, 0, 4, 1, 9, 9, 0, 2, 8, 0, 4, 1, 9, 9, 0, 2, 8, 0, 4, 1, 9, 9, 0};

        double[] out = UtilMethods.padSignal(signal, "reflect");
        Assertions.assertArrayEquals(reflect, out, 0.001);

        out = UtilMethods.padSignal(signal, "constant");
        Assertions.assertArrayEquals(constant, out, 0.001);

        out = UtilMethods.padSignal(signal, "nearest");
        Assertions.assertArrayEquals(nearest, out, 0.001);

        out = UtilMethods.padSignal(signal, "mirror");
        Assertions.assertArrayEquals(mirror, out, 0.001);

        out = UtilMethods.padSignal(signal, "wrap");
        Assertions.assertArrayEquals(wrap, out, 0.001);

    }

    @Test
    public void diffTest() {
        double[] seq = {1, 2, 3, 4, 6, -4};
        double[] result = {1, 1, 1, 2, -10};
        double[] out = UtilMethods.diff(seq);
        Assertions.assertArrayEquals(result, out, 0.001);
    }

    @Test
    public void unwrapTest() {
        double[] seq1 = {0.0 , 0.78539816, 1.57079633, 5.49778714, 6.28318531};
        double[] seq2 = {-0.5836157665365642, 0.9228635199201507, 1.7407486118278503, 2.570531442761638, -2.710817667585861, -1.8187666240910918};
        double[] result1 = {0.0,  0.785,  1.571, -0.785,  0.0};
        double[] result2 = {-0.584,  0.923,  1.741,  2.571,  3.572,  4.464};
        double[] out1 = UtilMethods.unwrap(seq1);
        double[] out2 = UtilMethods.unwrap(seq2);
        Assertions.assertArrayEquals(result1, out1, 0.001);
        Assertions.assertArrayEquals(result2, out2, 0.001);
    }

    @Test
    public void roundTest1() {
        double val = 123.45667;
        double out1 = UtilMethods.round(val, 1);
        Assertions.assertEquals(123.5, out1, 0.00001);
        double out2 = UtilMethods.round(val, 3);
        Assertions.assertEquals(123.457, out2, 0.00001);
    }

    @Test
    public void roundTest2() {
        double[] arr = {7.40241449, -14.34767505,  12.88704602,   5.81646305};
        double[] res1 = {7.4, -14.3,  12.9,   5.8};
        double[] out1 = UtilMethods.round(arr, 1);
        Assertions.assertArrayEquals(res1, out1, 0.00001);
        double[] res2 = {7.402, -14.348,  12.887,   5.816};
        double[] out2 = UtilMethods.round(arr, 3);
        Assertions.assertArrayEquals(res2, out2, 0.00001);
    }

    @Test
    public void moduloTest() {
        double divisor = -2;
        double dividend = 4;
        double out = UtilMethods.modulo(divisor, dividend);
        Assertions.assertEquals(2, out, 0.001);
    }

    @Test
    public void rescaleTest() {
        double[] arr1 = {12, 14, 15, 15, 16};
        double[] result1 = {10, 15, 17.5, 17.5, 20};
        double[] out1 = UtilMethods.rescale(arr1, 10, 20);
        Assertions.assertArrayEquals(result1, out1, 0.001);
    }

    @Test
    public void standardizeTest() {
        double[] arr1 = {12, 14, 15, 15, 16};
        double[] result1 = {0, 0.5, 0.75, 0.75, 1};
        double[] out1 = UtilMethods.standardize(arr1);
        Assertions.assertArrayEquals(result1, out1, 0.001);
    }

    @Test
    public void normalizeTest() {
            double[] arr1 = {12, 14, 15, 15, 16};
            double[] result1 = {-1.583, -0.264, 0.396, 0.396, 1.055};
            double[] out1 = UtilMethods.normalize(arr1);
        Assertions.assertArrayEquals(result1, out1, 0.001);
    }

    @Test
    public void zeroCentreTest() {
        double[] arr1 = {12, 14, 15, 15, 16};
        double[] result1 = {-2.4, -0.4, 0.6, 0.6, 1.6};
        double[] out1 = UtilMethods.zeroCenter(arr1);
        Assertions.assertArrayEquals(result1, out1, 0.001);
    }

    @Test
    public void almostEqualsTest() {
        double[] test1 = {1.23320, 1.23321};
        double[] test2 = {1.23310, 1.23320};
        Assertions.assertTrue(UtilMethods.almostEquals(test1[0], test1[1], 0.0001));
        Assertions.assertFalse(UtilMethods.almostEquals(test2[0], test2[1], 0.00001));
    }

    @Test
    public void convertToPrimitiveIntTest() {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int[] nums = {1, 2, 3, 4, 5};
        int[] out = UtilMethods.convertToPrimitiveInt(numbers);
        Assertions.assertTrue(out instanceof int[]);
        Assertions.assertArrayEquals(nums, out);
    }

    @Test
    public void convertToPrimitiveDoubleTest() {
        ArrayList<Double> numbers = new ArrayList<Double>(Arrays.asList(1.1, 2.22, 3.3, 4.4, 5.55));
        double[] nums = {1.1, 2.22, 3.3, 4.4, 5.55};
        double[] out = UtilMethods.convertToPrimitiveDouble(numbers);
        Assertions.assertTrue(out instanceof double[]);
        Assertions.assertArrayEquals(nums, out, 0.001);
    }

    @Test
    public void argminTest() {
        double[] arr = {1, 2, 5, 3, 4, 6, 1, 6};
        int index = 0;
        int indexRev = 6;
        int out = UtilMethods.argmin(arr, false);
        Assertions.assertEquals(index, out);
        out = UtilMethods.argmin(arr, true);
        Assertions.assertEquals(indexRev, out);
    }

    @Test
    public void argmaxTest() {
        double[] arr = {1, 2, 5, 3, 4, 6, 1, 6};
        int index = 5;
        int indexRev = 7;
        int out = UtilMethods.argmax(arr, false);
        Assertions.assertEquals(index, out);
        out = UtilMethods.argmax(arr, true);
        Assertions.assertEquals(indexRev, out);
    }

    @Test
    public void argSortTest() {
        double[] test1 = {3, 1, 2};
        int[] res1 = {1, 2, 0};
        double[] test2 = {1.23, 4.55, -1.33, 2.45, 6.78, 1.29};
        int[] res2 = {2, 0, 5, 3, 1, 4};
        Assertions.assertArrayEquals(res1, UtilMethods.argsort(test1, true));
        Assertions.assertArrayEquals(res2, UtilMethods.argsort(test2, true));
    }

    @Test
    public void ecgTest() throws Exception {
        int resultLength = 108000;
        double[] data = UtilMethods.electrocardiogram();
        Assertions.assertEquals(resultLength, data.length);
    }

    @Test
    public void absoluteTest() throws Exception {
        double[][] test1 = {{1.22, -3.41, -0.22}, {-0.89, 1.6, 7.65}};
        double[][] res1 = {{1.22, 3.41, 0.22}, {0.89, 1.6, 7.65}};
        double[][] out1 = UtilMethods.absoluteArray(test1);

        double[] test2 = {1.22, -3.41, -0.22, 5.44, -9.28};
        double[] res2 = {1.22, 3.41, 0.22, 5.44, 9.28};
        double[] out2 = UtilMethods.absoluteArray(test2);

        for (int i=0; i<res1.length; i++) {
            Assertions.assertArrayEquals(res1[i], out1[i], 0.001);
        }
        Assertions.assertArrayEquals(res2, out2, 0.001);
    }

    @Test
    public void transposeTest() {
        double[][] test1 = {{1, 2}, {3, 4}};
        double[][] res1 = {{1, 3}, {2, 4}};
        double[][] out1 = UtilMethods.transpose(test1);

        for (int i=0; i<res1.length; i++) {
            Assertions.assertArrayEquals(res1[i], out1[i], 0.001);
        }

        double[][] test2 = {{1.45, 2.09, 0.85}, {-3.08, 4.56, 7.45}};
        double[][] res2 = {{1.45, -3.08}, {2.09, 4.56}, {0.85, 7.45}};
        double[][] out2 = UtilMethods.transpose(test2);

        for (int i=0; i<res2.length; i++) {
            Assertions.assertArrayEquals(res2[i], out2[i], 0.001);
        }
    }

    @Test
    public void matrixMultiplyTest() {
        double[][] m1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] m2 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] result = {{30, 36, 42}, {66, 81, 96}, {102, 126, 150}};
        double[][] out = UtilMethods.matrixMultiply(m1, m2);
        for (int i=0; i<result.length; i++) {
            Assertions.assertArrayEquals(result[i], out[i], 0.001);
        }
    }

    @Test
    public void scalarOperationTest() {
        double[] arr = {1.23, 6.54, 4.56, 9.04, 2.88};
        double[] resAdd = {2.25,  7.56,  5.58, 10.06,  3.9};
        double[] resSub = {0.21, 5.52, 3.54, 8.02, 1.86};
        double[] resMul = {1.2546, 6.6708, 4.6512, 9.2208, 2.9376};
        double[] resDiv = {1.2059, 6.4118, 4.4706, 8.8627, 2.8235};

        double[] arrAdd = UtilMethods.scalarArithmetic(arr, 1.02, "add");
        double[] arrSub = UtilMethods.scalarArithmetic(arr, 1.02, "sub");
        double[] arrMul = UtilMethods.scalarArithmetic(arr, 1.02, "mul");
        double[] arrDiv = UtilMethods.scalarArithmetic(arr, 1.02, "div");

        Assertions.assertArrayEquals(resAdd, arrAdd, 0.001);
        Assertions.assertArrayEquals(resSub, arrSub, 0.001);
        Assertions.assertArrayEquals(resMul, arrMul, 0.001);
        Assertions.assertArrayEquals(resDiv, arrDiv, 0.001);
    }
}
