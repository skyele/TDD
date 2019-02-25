package test.friend;

import friend.Friendships;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Friendships Tester.
 *
 * @author <Authors name>
 * @since <pre>¶þÔÂ 25, 2019</pre>
 * @version 1.0
 */
public class FriendshipsTest {

    Friendships friendships;

    @BeforeClass
    public static void beforeClass(){

    }

    @Before
    public void before() throws Exception {
        friendships = new Friendships();
        friendships.makeFriends("Joe","Audrey");
        friendships.makeFriends("Joe","Peter");
        friendships.makeFriends("Joe","Michael");
        friendships.makeFriends("Joe","Britney");
        friendships.makeFriends("Joe","Paul");
    }

    @AfterClass
    public static void afterClass(){

    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: makeFriends(String person1, String person2)
     *
     */
    @Test
    public void testMakeFriends() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getFriendsList(String person)
     *
     */
    @Test
    public void testGetFriendsList() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: areFriends(String person1, String person2)
     *
     */
    @Test
    public void testAreFriends() throws Exception {
//TODO: Test goes here...
    }


    /**
     *
     * Method: addFriend(String person, String friend)
     *
     */
    @Test
    public void testAddFriend() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = Friendships.getClass().getMethod("addFriend", String.class, String.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
    }

    @Test
    public void alexDoesNotHaveFriends(){
        Assert.assertTrue("alex does not have friends", friendships.getFriendsList("Alex").isEmpty());
    }

    @Test
    public void joeHas5Friends(){
        Assert.assertEquals("Joe has 5 friends", 5, friendships.getFriendsList("Joe").size());
    }

    @Test
    public void joeIsFriendWithEveryone(){
        assertThat(friendships.getFriendsList("Joe"), containsInAnyOrder("Audrey", "Peter", "Michael", "Britney", "Paul"));
    }
} 
