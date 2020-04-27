package com.onyx.jdsp;

import com.onyx.jdsp.signal.Smooth;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSmooth {
    private double[] signal = {0.425, 0.445, 0.445, 0.405, 0.4, 0.43, 0.44, 0.43, 0.435, 0.455, 0.465, 0.455, 0.44,
            0.435, 0.43, 0.405, 0.375, 0.345, 0.32, 0.33, 0.335, 0.325, 0.29, 0.265, 0.22, 0.2, 0.175, 0.115, 0.005,
            -0.07, -0.01, 0.11, 0.18, 0.23, 0.24, 0.245, 0.245, 0.245, 0.235, 0.23, 0.21, 0.21, 0.235, 0.26, 0.265,
            0.255, 0.25, 0.26, 0.3,0.31};
    @Test
    public void rectangularSmoothTest() {
        final double[] result = {0.427, 0.428, 0.426, 0.428, 0.436, 0.444, 0.446, 0.445, 0.445, 0.441, 0.429, 0.412,
                0.393, 0.377, 0.363, 0.348, 0.331, 0.316, 0.298, 0.281, 0.259, 0.227, 0.181, 0.13, 0.091, 0.075, 0.072,
                0.08, 0.098, 0.132, 0.177, 0.214, 0.231, 0.239, 0.236, 0.231, 0.23, 0.232, 0.235, 0.238, 0.241, 0.248,
                0.261, 0.271};

        Smooth s1 = new Smooth(this.signal, 7, "rectangular");
        double[] out = s1.smoothSignal();
        assertArrayEquals(result, out, 0.001);
    }

    @Test
    public void triangularSmoothTest() {
        final double[] result = {0.423, 0.422, 0.424, 0.429, 0.436, 0.443, 0.448, 0.45, 0.449, 0.442, 0.432, 0.417,
                0.397, 0.376, 0.356, 0.341, 0.331, 0.321, 0.307, 0.286, 0.259, 0.228, 0.19, 0.143, 0.092, 0.05, 0.032,
                0.05, 0.095, 0.148, 0.195, 0.224, 0.237, 0.241, 0.239, 0.233, 0.228, 0.225, 0.228, 0.237, 0.246, 0.253,
                0.259, 0.265};

        Smooth s1 = new Smooth(this.signal, 7, "triangular");
        double[] out = s1.smoothSignal();
        assertArrayEquals(result, out, 0.001);
    }
}
