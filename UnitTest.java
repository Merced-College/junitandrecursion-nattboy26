public class UnitTest {

    //first JUnit test
    @org.junit.Test
    public void testCountHi1() {
        int result = TestClass.countHi("xxhixxhiabchidhixx");
        org.junit.Assert.assertEquals(4, result);
    }//end testCountHi1

    //second JUnit CountHi test
    @org.junit.Test
    public void testCountHi2() {
        int result = TestClass.countHi("xxasdflkhsxx");
        org.junit.Assert.assertEquals(0, result);
    }//end testCountHi2

    //third JUnit CountHi test
    @org.junit.Test
    public void testCountHi3() {
        int result = TestClass.countHi("hihihihihihihihihihihihihisdfs");
        org.junit.Assert.assertEquals(13, result);
    }//end testCountHi3

    //fourth JUnit CountHi test
    @org.junit.Test
    public void testCountHi4() {
        int result = TestClass.countHi("");
        org.junit.Assert.assertEquals(0, result);
    }//end testCountHi4

    //fifth JUnit CountHi test
    @org.junit.Test
    public void testCountHi5() {
        int result = TestClass.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }//end testCountHi5
    
    //first JUnit strCount test
    @org.junit.Test
    public void testStrCount1() {
        int result = TestClass.strCount("catcowcat", "cat");
        org.junit.Assert.assertEquals(2, result);
    }//end testStrCount1

    //second JUnit strCount test
    @org.junit.Test
    public void testStrCount2() {
        int result = TestClass.strCount("catcowcat", "dog");
        org.junit.Assert.assertEquals(0, result);
    }//end testStrCount2

    //third JUnit strCount test
    @org.junit.Test
    public void testStrCount3() {
        int result = TestClass.strCount("catcatcatcat", "cat");
        org.junit.Assert.assertEquals(4, result);
    }//end testStrCount3

    //fourth JUnit strCount test
    @org.junit.Test
    public void testStrCount4() {
        int result = TestClass.strCount("", "cat");
        org.junit.Assert.assertEquals(0, result);
    }//end testStrCount4

    //fifth JUnit strCount test
    @org.junit.Test
    public void testStrCount5() {   
        int result = TestClass.strCount(null, "cat");
        org.junit.Assert.assertEquals(0, result);
    }//end testStrCount5

    //first JUnit count8 test
    @org.junit.Test
    public void testCount8_1() {
        int result = TestClass.count8(881238);
        org.junit.Assert.assertEquals(4, result);
    }//end testCount8_1

    //second JUnit count8 test
    @org.junit.Test
    public void testCount8_2() {
        int result = TestClass.count8(12345);
        org.junit.Assert.assertEquals(0, result);
    }//end testCount8_2

    //third JUnit count8 test
    @org.junit.Test
    public void testCount8_3() {
        int result = TestClass.count8(88888);
        org.junit.Assert.assertEquals(9, result);
    }//end testCount8_3

    //fourth JUnit count8 test
    @org.junit.Test
    public void testCount8_4() {
        int result = TestClass.count8(0);
        org.junit.Assert.assertEquals(0, result);
    }//end testCount8_4

    //fifth JUnit count8 test
    @org.junit.Test
    public void testCount8_5() {
        int result = TestClass.count8(8);
        org.junit.Assert.assertEquals(1, result);
    }//end testCount8_5

    //first JUnit CountHi2 test
    @org.junit.Test
    public void testCountHi2_1() {
        int result = TestClass.countHi("hihihi");
        org.junit.Assert.assertEquals(3, result);
    }//end testCountHi2_1

    //second JUnit CountHi2 test
    @org.junit.Test
    public void testCountHi2_2() {
        int result = TestClass.countHi("hello");
        org.junit.Assert.assertEquals(0, result);
    }//end testCountHi2_2

    //third JUnit CountHi2 test
    @org.junit.Test
    public void testCountHi2_3() {
        int result = TestClass.countHi("ahixhi");
        org.junit.Assert.assertEquals(2, result);
    }//end testCountHi2_3

    //fourth JUnit CountHi2 test
    @org.junit.Test
    public void testCountHi2_4() {
        int result = TestClass.countHi("xhixhi");
        org.junit.Assert.assertEquals(2, result);
    }//end testCountHi2_4

    //fifth JUnit CountHi2 test
    @org.junit.Test
    public void testCountHi2_5() {
        int result = TestClass.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }//end testCountHi2_5

    //first JUnit stringClean test
    @org.junit.Test
    public void testStringClean1() {
        String result = TestClass.stringClean("yyzzza");
        org.junit.Assert.assertEquals("yza", result);
    }//end testStringClean1

    //second JUnit stringClean test
    @org.junit.Test
    public void testStringClean2() {
        String result = TestClass.stringClean("abbbcdd");
        org.junit.Assert.assertEquals("abcd", result);
    }//end testStringClean2

    //third JUnit stringClean test
    @org.junit.Test
    public void testStringClean3() {
        String result = TestClass.stringClean("Hello");
        org.junit.Assert.assertEquals("Helo", result);
    }//end testStringClean3

    //fourth JUnit stringClean test
    @org.junit.Test
    public void testStringClean4() {
        String result = TestClass.stringClean(null);
        org.junit.Assert.assertEquals(null, result);
    }//end testStringClean4

    //fifth JUnit stringClean test
    @org.junit.Test
    public void testStringClean5() {
        String result = TestClass.stringClean("");
        org.junit.Assert.assertEquals("", result);
    }//end testStringClean5

}//end UnitTest
