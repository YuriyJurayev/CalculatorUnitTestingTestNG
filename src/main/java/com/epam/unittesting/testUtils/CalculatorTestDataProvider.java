package com.epam.unittesting.testUtils;

import org.testng.annotations.DataProvider;

public class CalculatorTestDataProvider {

    @DataProvider(name = "sumLong")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {2, 3, 5},
                {2, 2, 4},
                {1, 0, 1}
        };

    }
    @DataProvider(name = "sumLong1")
    public Object[][] sumDataProvider1() {
        return new Object[][]{
                {214, 305, 519},
                {10, 10, 20},
                {44, 6, 50}
        };
    }

    @DataProvider(name = "sumDouble")
    public Object[][] sumDoubleDataProvider() {
        return new Object[][]{
                {214.5, 305.5, 520},
                {10.1, 10.3, 20.4},
                {44.0, 16, 60},
                {44.9, 16.1, 61},
                {44.7, 16, 60.7},
                {-16.0, -44.1, -60.1},
                {-16.0, 44.9, 28.9},
                {16.0, -44.9, -28.9},
                {16.0, -44.7, -28.7},
                {16.0, -44.8, -28.8},
                {16.0, -44.6, -28.6},
                {16.0, -44.5, -28.5},
                {16.0, -44.4, -28.4},
                {16.0, -44.3, -28.3},
                {16.0, -44.2, -28.2},
                {16.0, -44.7, -28.1}
        };
    }

    @DataProvider(name = "subDouble")
    public Object[][] subDoubleDataProvider() {
        return new Object[][]{
                {214.5, 305.5, -91},
                {25.9, 14.7, 11.2},
                {75.45, 25.34, 50.11},
                {100.01, 64, 36.01},
                {100.1, 64.0, 36.1},
                {100.4, 64.0, 36.4},
                {100.6, 64.0, 36.6},
                {100.9, 64.0, 36.9},

        };
    }

    @DataProvider(name = "subLong")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {16, 15, 1},
                {15, 15, 0},
                {10, -15, 25},
                {-10, -15, 5},
                {-10, 15, -25}
        };
    }
    @DataProvider(name = "multLong")
    public Object[][] multDataProvider() {
        return new Object[][]{
                {16, 10, 160},
                {5, 5, 25},
                {10, -15, -150},
                {-10, -15, 150},
                {4, 0, 0}
        };
    }

    @DataProvider(name = "multDouble")
    public Object[][] multDoubleDataProvider() {
        return new Object[][]{
                {1.1, 2, 2.2},
                {5.5, 5.5, 30.25},
                {10, -15.1, -151},
                {-10, -15, 150},
                {4.77, 4.78, 22.8006},
                {4.77, 1, 4.77},
                {4.1, 0, 0},
                {0, 4.1, 0}
        };
    }

    @DataProvider(name = "divLong")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {160, 10, 16},
                {25, 5, 5},
                {-150, 15, -10},
                {-150, -15, 10},
                {0, 4, 0},
                {4, 0, 0},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "divDouble")
    public Object[][] divDoubleDataProvider() {
        return new Object[][]{
                {2.2, 2, 1.1},
                {30.25, 5.5, 5.5},
                {151, -15.1, -10},
                {-150, -15, 10},
                {22.8006, 4.78, 4.77},
                {4.77, 1, 4.77},
                {0, 4, 0},
                {4.2, 0, 0},
                {0.000, 0, 0}
        };
    }
    @DataProvider(name = "pow")
    public Object[][] powDataProvider() {
        return new Object[][]{
                {3, 2, 9},
                {5, 2, 25},
                {2, 3, 8},
                {2, 0, 1},
                {2.2, 1.1, 2.2},
                {-2.2, 1.1, -2.2},
                {0, 3, 0}
        };
    }
    @DataProvider(name = "sqrt")
    public Object[][] sqrtDataProvider() {
        return new Object[][]{
                {9, 3},
                {4, 2},
                {49, 7},
                {1.21, 1.1},
                {-49, 7},
                {0, 0},
        };
    }
    @DataProvider(name = "tg")
    public Object[][] tgDataProvider() {
        return new Object[][]{
                {30.0, 0.5774},
                {45, 1},
                {60.0, 1.7321}
        };
    }
    @DataProvider(name = "ctg")
    public Object[][] ctgDataProvider() {
        return new Object[][]{
                {30.0, 1.732},
                {45, 1},
                {60.0, 0.577}
        };
    }
    @DataProvider(name = "cos")
    public Object[][] cosDataProvider() {
        return new Object[][]{
                {1, 0.54030230586814},
                {50, 0.96496602849211}
        };
    }
    @DataProvider(name = "sin")
    public Object[][] sinDataProvider() {
        return new Object[][]{
                {45, 0.7071067811865475},
                {60, 0.8660254037844386},
                {90, 1}
        };
    }
    @DataProvider(name = "isPositive")
    public Object[][] isPositiveDataProvider() {
        return new Object[][]{
                {1},
                {0},
                {-1}
        };
    }
    @DataProvider(name = "isNegative")
    public Object[][] isNegativeDataProvider() {
        return new Object[][]{
                {11},
                {0},
                {-1}
        };
    }
}

