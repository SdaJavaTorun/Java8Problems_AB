package List1;

import com.sdajava.javaEightProblems.ArrayExec;
import com.sdajava.javaEightProblems.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Andrzej on 01.04.2017.
 */

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertTrue;

public class ArrayTest {

    @Test
    public void shouldFindLastElementFromList(){
        assertThat(ArrayExec.last(asList("a","b","c")),is(equalTo("b")));
    }

    @Test
    public void shouldFindLastElementFromLinkedList(){
        LinkedList<String> list =
                new LinkedList(Arrays.asList("a","b","c"));
        //assertThat(ArrayExec.last(asList("a","b","c")),is(equalTo("b")));
        assertThat(ArrayExec.last(list), is(equalTo("c")));
    }

    @Test
    public void shouldFindLastElementFromLinkedList2(){
        LinkedList<String> list = CollectionUtils.linkedList("a", "b", "c");
        //assertThat(ArrayExec.last(asList("a","b","c")),is(equalTo("b")));
        assertThat(ArrayExec.last(list), is(equalTo("c")));
    }

    //@Test //dla chętnych
    //public void shouldFindLastElementFromRecursion() {
    //    assertThat(ArrayExec.lastRecursiva(asList("a", "b", "c"),is(equalTo("c"))));
    //}

    @Test
    public void listOfEmptyListShouldBe0() {
        long length = ArrayExec.length(Collections.emptyList());
        assertThat(length, is(equalTo(0)));
    }

   // @Test //SPRAWDZIć
   // public void shouldFIndListofNonEmptyList(){
     //   assertThat(ArrayExec.length(asList(1,2,3,4,5,6), is(equalTo(6))));
    //}

    @Test
    public void sholudBeReverseAList() {
        List<String> numbers = asList("a", "b");
        assertThat(ArrayExec.revarse(numbers), is (equalTo(asList("b", "a"))));
    }

    @Test
    public void shouldReturnTrueWhenListIsPalindrome() {
        assertTrue(ArrayExec.isPalindrome(asList("a","l","a")));
    }

    @Test
    public void shouldBERemoveConcescutiveDuplikatesInAList(){
        List<String> compressedList = ArrayExec.compress(asList("a","a","b","b","c","c"));
        assertThat(compressedList, contains("a","b","c"));
    }

    @Test
    public void shouldDuplicateElementsInAList(){
        List<String> duplicate = ArrayExec.duplicates(Arrays.asList("a","b","c"), 3);
        assertThat(duplicate, contains("a", "a","a", "b", "b", "b","c", "c", "c"));
    }

}
