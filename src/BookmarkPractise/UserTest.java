package BookmarkPractise;

public class UserTest {
    public void printUserType(User u) {
        u.printUserType();
    }

    public void approveReview(Staff s) {
        if (s instanceof Editor) {
            ((Editor) s).approveReview();
        } else {
            System.out.println("Invalid object passed!!");
        }
    }


    public static void main(String[] args) {
        // Part 1
        User user = new User();
        User staff = new Staff();
        User editor = new Editor();

        // user.printUserType();
        // staff.postAReview();
        //Staff.approveReview();

        UserTest ut = new UserTest();

        ut.printUserType(user);
        ut.printUserType(staff);
        ut.printUserType(editor);

        // Part 2
        //editor.approveReview();
        editor.postAReview();
        editor.saveWebLink();
        /*first goes to editor calss then staff class then user then
        after finding post a review method in saveWebLink method
        in userClass
        it stats looking for the method from start i.e editor class.
         */

        // Casting & instanceof demo
        ut.approveReview(new Staff());
        ut.approveReview(new Editor());
    }

}
