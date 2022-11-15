import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class arrayMathTest {
    /*
    @Test
    void firstMod(){
        var Object = new arrayMath();
        int[] Array = {12, 5, 1, 5, 6};

        assertEquals(0, Object.linearSearch(Array, 12, 0, Array.length));
        assertEquals( COMPARE.GREATER, Object.compareMOD(12, Array));
    }

    @Test
    void firstMed(){
        var Object = new arrayMath();
        int[] Array = {10, 9, 4, 4, -4};
        assertEquals(0, Object.linearSearch(Array, 10, 0, Array.length));
        assertEquals(COMPARE.GREATER, Object.compareMED(10, Array));
    }

    @Test
    void firstAvg(){
        var Object = new arrayMath();
        int[] Array = {10, 10, 10};
        assertEquals(0, Object.linearSearch(Array, 10, 0, Array.length));
        assertEquals(COMPARE.EQUAL, Object.compareAVG(10, Array));
    }


    @Test
    void notPresentMod(){
        var Object = new arrayMath();
        int[] Array = {29, 5, 1, 5, 6};

        assertEquals(-1, Object.linearSearch(Array, 12, 0, Array.length));
        assertEquals( COMPARE.LOWER, Object.compareMOD(2, Array));

    }

    @Test
    void notPresentMed(){
        var Object = new arrayMath();
        int[] Array = {10, 9, 0, 4, -4};
        assertEquals(-1, Object.linearSearch(Array, 25, 0, Array.length));
        assertEquals(COMPARE.GREATER, Object.compareMED(25, Array));
    }

    @Test
    void notPresentAvg(){
        var Object = new arrayMath();
        int[] Array = {10, 10, 10};
        assertEquals(-1, Object.linearSearch(Array, 15, 0, Array.length));
        assertEquals(COMPARE.GREATER, Object.compareAVG(15, Array));
    }


    @Test
    void negativeMod(){
        var Object = new arrayMath();
        int[] Array = {-5, -3, -7, -3, -10};
        assertEquals(1, Object.linearSearch(Array, -3, 0, Array.length));
        assertEquals( COMPARE.EQUAL, Object.compareMOD(-3, Array));
    }

    @Test
    void negativeMed(){
        var Object = new arrayMath();
        int[] Array = {10, 9, -1, 4, -4};
        assertEquals(2, Object.linearSearch(Array, -1, 0, Array.length));
        assertEquals(COMPARE.EQUAL, Object.compareMED(-1, Array));
    }

    @Test
    void negativeAvg(){
        var Object = new arrayMath();
        int[] Array = {10, -2, 10, 5, 4, 3};
        assertEquals(1, Object.linearSearch(Array, -2, 0, Array.length));
        assertEquals(COMPARE.LOWER, Object.compareAVG(-2, Array));
    }


    @Test
    void multipleMod(){
        var Object = new arrayMath();
        int[] Array = {12, 5, 1, 5, 6};

        assertEquals(1, Object.linearSearch(Array, 5, 0, Array.length));
        assertEquals( COMPARE.EQUAL, Object.compareMOD(5, Array));
    }

    @Test
    void multipleMed(){
        var Object = new arrayMath();
        int[] Array = {10, -4, 5, 4, -4};
        assertEquals(1, Object.linearSearch(Array,-4,  0, Array.length));
        assertEquals(COMPARE.LOWER, Object.compareMED(-4, Array));
    }

    @Test
    void multipleAvg(){
        var Object = new arrayMath();
        int[] Array = {10, 25, 10, -30, -50};
        assertEquals(0, Object.linearSearch(Array, 10, 0, Array.length));
        assertEquals(COMPARE.GREATER, Object.compareAVG(10, Array));
    }


    @Test
    void minMaxMod(){
        var Object = new arrayMath();
        int[] Array = {25};

        assertEquals(-1, Object.linearSearch(Array, 12, 0, Array.length));
        assertEquals( COMPARE.LOWER, Object.compareMOD(12, Array));
        assertEquals(COMPARE.EQUAL, Object.compareMinToMax(Array));
    }

    @Test
    void minMaxMed(){
        var Object = new arrayMath();
        int[] Array = {36, 36, 36};
        assertEquals(0, Object.linearSearch(Array, 36, 0, Array.length));
        assertEquals(COMPARE.EQUAL, Object.compareMED(36, Array));
        assertEquals(COMPARE.EQUAL, Object.compareMinToMax(Array));

    }

    @Test
    void minMaxAvg(){
        var Object = new arrayMath();
        int[] Array = {10, 10, 10};
        assertEquals(-1, Object.linearSearch(Array, 15, 0, Array.length));
        assertEquals(COMPARE.GREATER, Object.compareAVG(15, Array));
        assertEquals(COMPARE.EQUAL, Object.compareMinToMax(Array));

    }

    @Test
    void LargestMod(){
        var Object = new arrayMath();
        int[] Array = {2, 5, 15, 15, 6};

        assertEquals(2, Object.linearSearch(Array, 15, 0, Array.length));
        assertEquals( Object.max(Array), 15);
        assertEquals(COMPARE.EQUAL, Object.compareMOD(15, Array));
    }

    @Test
    void LargestMed(){
        var Object = new arrayMath();
        int[] Array = {9, 9, 8, 10, -9};
        assertEquals(3, Object.linearSearch(Array, 10, 0, Array.length));
        assertEquals( Object.max(Array), 10);
        assertEquals(COMPARE.GREATER, Object.compareMED(10, Array));
    }

    @Test
    void LargestAvg(){
        var Object = new arrayMath();
        int[] Array = {10, 10, 10};
        assertEquals(0, Object.linearSearch(Array, 10, 0, Array.length));
        assertEquals( Object.max(Array), 10);
        assertEquals(COMPARE.EQUAL, Object.compareAVG(10, Array));


    }

    @Test
    void SmallestMod(){
        var Object = new arrayMath();
        int[] Array = {12, 5, 1, 5, -1, 1};

        assertEquals(4, Object.linearSearch(Array, -1, 0, Array.length));
        assertEquals( Object.min(Array), -1);
        assertEquals(COMPARE.LOWER, Object.compareMOD(-1, Array));
    }

    @Test
    void SmallestMed(){
        var Object = new arrayMath();
        int[] Array = {-9, 9, -6, 4, -4};
        assertEquals(0, Object.linearSearch(Array, -9, 0, Array.length));
        assertEquals( Object.min(Array), -9);
        assertEquals(COMPARE.LOWER, Object.compareMED(-9, Array));
    }

    @Test
    void SmallestAvg(){
        var Object = new arrayMath();
        int[] Array = {10, 40, 23, -15, 10};
        assertEquals(3, Object.linearSearch(Array, -15, 0, Array.length));
        assertEquals( Object.min(Array), -15);
        assertEquals(COMPARE.LOWER, Object.compareAVG(-15, Array));
    }

     */
    @BeforeEach
    public void beforeFunction(){
        var arrayMath = new arrayMath();

        //System.out.printf("Running test...\n");
    }

    /*@Test
    void emptyArray(){
        //Test Path 1 Covering TR 9
        int[] arr = {};
        assertEquals(-1, arrayMath.linearSearch(arr, 10, 0, 0));
    }

    @Test
    void startEqualsEnd(){
        //Test Path 2 Covering TR 3
        int[] arr = {1};
        assertEquals(-1, arrayMath.linearSearch(arr, 10, 1, 1));
    }

    @Test
    void targetNotFound(){
        //Test Path 2 Covering TR 9
        int[] arr = {5, 3, 6};
        assertEquals(-1, arrayMath.linearSearch(arr, 2, 2, 2));
    }

    @Test
    void arrayEntersLoop(){
        //Test Path 3 Covering TR 2
        int[] arr = {1};
        assertEquals(-1, arrayMath.linearSearch(arr, 2, 0, 1));
    }

    @Test
    void arrayValidTNF(){
        //Test Path 3 Covering TR 3
        int[] arr = {3,4};
        assertEquals(-1, arrayMath.linearSearch(arr, 6, 1, 2));
    }

    @Test
    void arrayLoops(){
        //Test Path 3 Covering TR 4
        int[] arr = {-5,-4};
        assertEquals(-1, arrayMath.linearSearch(arr, 5, 1, 2));
    }

    @Test
    void arrayEntersLoopTNF(){
        //Test Path 3 Covering TR 5
        //ID 23
        int[] arr = {1, 3, 4};
        assertEquals(-1, arrayMath.linearSearch(arr, 0, 1, 2));
    }

    @Test
    void arrayValidAndExitsLoopTNF(){
        //Test Path 3 Covering TR 9
        //ID 27
        int[] arr = {5};
        assertEquals(-1, arrayMath.linearSearch(arr, 1, 0, 1));
    }

    @Test
    void targetFirstIndex(){
        //Test Path 4 Covering TR 1
        //ID 28
        int[] arr = {3, 5, 5, 7, 3, 5};
        assertEquals(0, arrayMath.linearSearch(arr, 3, 0, 6));
    }

    @Test
    void loopFindsTarget(){
        //Test Path 5 Covering TR 1
        //ID 37
        int[] arr = {0, 1};
        assertEquals(1, arrayMath.linearSearch(arr, 1, 0, 2));
    }

    @Test
    void arrayEnterLoopInsideTF(){
        //Test Path 5 Covering TR 2
        //ID 38
        int[] arr = {4, 2, 5};
        assertEquals(2, arrayMath.linearSearch(arr, 5, 1, 3));
    }

    @Test
    void arrayLoopsWithTF(){
        //Test Path 5 Covering TR 4
        //ID 40
        int[] arr = {0, 4, 1, 5};
        assertEquals(1, arrayMath.linearSearch(arr, 4, 0, 4));
    }

    @Test
    void targetNotFirstButNoExit(){
        //Test Path 5 Covering TR 6
        //ID 42
        //So the array loops, where it does not fail to reenter the array
        int[] arr = {0, 1, 2, 4};
        assertEquals(3, arrayMath.linearSearch(arr, 4, 0, 4));
    }

    @Test
    void arrayExitLoopFindTarget(){
        //Test Path 5 Covering TR 8
        //ID 44
        int[] arr = {6, 9};
        assertEquals(1, arrayMath.linearSearch(arr, 9, 0, 2));
    }

    @Test
    void targetNotFirstAndLoopsTNF(){
        //Test Path 6 Covering TR 2
        //ID 47
        int[] arr = {14, 25, 15, 9, -4, 9};
        assertEquals(-1, arrayMath.linearSearch(arr, 5, 0, 6));
    }

    @Test
    void arrayMultLoopsTNF(){
        //Test Path 6 Covering TR 3
        //ID 48
        int[] arr = {-4, -1, 5, 0, -1, -4, 9};
        assertEquals(-1, arrayMath.linearSearch(arr, 55, 0, 7));
    }

    @Test
    void arrayLoopsTNF(){
        //Test Path 6 Covering TR 4
        //ID 49
        int[] arr = {0, 1, 2, 3, 4, 5};
        assertEquals(-1, arrayMath.linearSearch(arr, 6, 0, 6));
    }

    @Test
    void arrayExitsLoopsTNF(){
        //Test Path 6 Covering TR 5
        //ID 44
        int[] arr = {1, 1, 1, 1};
        assertEquals(-1, arrayMath.linearSearch(arr, 0, 0, 4));
    }

    @Test
    void targetNotFirstButMultLoops(){
        //Test Path 6 Covering TR 6
        //ID 51
        int[] arr = {-27, 1, -24, 3, 5, 4, 5};
        assertEquals(-1, arrayMath.linearSearch(arr, 6, 0, 7));
    }

    @Test
    void arrayFailsToFindTargetAfterLoops(){
        //Test Path 6 Covering TR 7
        //ID 52
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(-1, arrayMath.linearSearch(arr, 55, 0, 5));
    }

    @Test
    void LoopsNoTarget(){
        //Test Path 6 Covering TR 9
        //ID 54
        int[] arr = {-2, -5, -1, -3};
        assertEquals(-1, arrayMath.linearSearch(arr, 1, 0, 4));
    }

    @Test
    void arrayMultLoopsFindsTarget(){
        //Test Path 7 Covering TR 1
        //ID 55
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(4, arrayMath.linearSearch(arr, 1, 0, 5));
    }

    @Test
    void targetNotFirstFindTarget(){
        //Test Path 7 Covering TR 2
        //ID 56
        int[] arr = {14, 25, 15, 9, -4, 9};
        assertEquals(4, arrayMath.linearSearch(arr, -4, 0, 5));
    }

    @Test
    void validArrayEntersLoopsAndFindsTarget(){
        //Test Path 7 Covering TR 4
        //ID 58
        int[] arr = {0, 1, 2, 3, 4, 5};
        assertEquals(3, arrayMath.linearSearch(arr, 3, 0, 6));
    }

    @Test
    void targetNotFirstButValidTF(){
        //Test Path 7 Covering TR 6
        //ID 60
        int[] arr = {-27, 1, -24, 3, 5, 4, 5};
        assertEquals(2, arrayMath.linearSearch(arr, -24, 0, 5));
    }

    @Test
    void targetExistsButNotFirstTwoLoops(){
        //Test Path 7 Covering TR 7
        //ID 61
        //Basically, it loops twice but it is not the first two indices
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(4, arrayMath.linearSearch(arr, 1, 0, 5));
    }

    @Test
    void targetExitsLoopWithTargetFound(){
        //Test Path 7 Covering TR 8
        //ID 62
        int[] arr = {6, 9, 4, 1, 6, 3, 10, 11, 15, 15, -2, 99, 0};
        assertEquals(11, arrayMath.linearSearch(arr, 99, 0, 13));
    }

    //Now we do du-pair

    @Test
    void maxFoundFirstLoopAfter(){

        int[] arr = {5, 3, 1};
        assertEquals(5, arrayMath.max(arr));
    }

    @Test
    void maxFoundAfterLoop(){

        int[] arr = {1, 3, 5};
        assertEquals(5, arrayMath.max(arr));
    }

    @Test
    void maxReturnedMin(){

        int[] arr = {};
        assertEquals(Integer.MIN_VALUE, arrayMath.max(arr));
    }

    @Test
    void maxAlreadyMinReturned(){

        int[] arr = {Integer.MIN_VALUE};
        assertEquals(Integer.MIN_VALUE, arrayMath.max(arr));
    }

    @Test
    void maxFoundReturned(){

        int[] arr = { 5 };
        assertEquals(5, arrayMath.max(arr));
    }

    @Test
    void maxReturnAfterLoopingOnce(){

        int[] arr = {1, 9};
        assertEquals(9, arrayMath.max(arr));
    }

    @Test
    void maxFirstAndReturnedAfterLoop(){

        int[] arr = {9, 4 , 2};
        assertEquals(9, arrayMath.max(arr));
    }

    @Test
    void arrayValid(){
        int[] arr = {1, 2, 3};
        assertNotEquals(Integer.MIN_VALUE, arrayMath.max(arr));
    } //This test is the same across TP 2-4. The only time it will fail is if array is size 0.
    */

    @Test
    void emptyArray(){
        int[] arr = {};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void notEmptyArray(){
        int[] arr = {3, 1, 4};
        assertEquals(1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void indexLessThanZero(){
        int[] arr = {};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void enterLoop(){
        int[] arr = {-1, 3, 2};
        assertEquals(2, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void returnIndexNegativeGreaterZero(){
        int[] arr = {-7, 6, -4};
        assertEquals(6, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void returnIndexNegativeLesserZero(){
        int[] arr = {-7, -3, -4};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void returnIndexPositiveGreaterZero(){
        int[] arr = {7, 3, 2};
        assertEquals(2, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void returnIndexPositiveLesserZero(){
        int[] arr = {1, -5, -2};
        assertEquals(1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void elementGreaterZeroreturnNegative(){
        int[] arr = {1, 3, 4};
        assertEquals(1, arrayMath.smallestPositiveNum(arr));
    }


    @Test
    void elementGreaterZeroReturnPositive(){
        int[] arr = {3, 4, 4};
        assertEquals(3, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void elementLesserZeroreturnNegative(){
        int[] arr = {-4, -3, -3};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }


    @Test
    void elementLesserZeroReturnPositive(){
        int[] arr = {3, -1, -4};
        assertEquals(3, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void lessThanReturnGreaterThanZero(){
        int[] arr = {3, 3, 2};
        assertEquals(2, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void lessThanReturnLessThanZero(){
        int[] arr = {-3, -1, -2};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void greaterThanReturnGreaterThanZero(){
        int[] arr = {3, 4, 11};
        assertEquals(3, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void greaterThanReturnLessThanEqualToZero(){
        int[] arr = {0, 0, 0};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void greaterThanZeroLessThanReturn(){
        int[] arr = {3, 1, 5, 7};
        assertEquals(1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void greaterThanZeroGreaterThanReturn(){
        int[] arr = {9, 11, 20};
        assertEquals(9, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void lessThanZeroLessThanReturn(){
        int[] arr = {-4, -3, -20};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }

    @Test
    void lessThanZeroGreaterThanReturn(){
        int[] arr = {0, -1, -7};
        assertEquals(-1, arrayMath.smallestPositiveNum(arr));
    }


}