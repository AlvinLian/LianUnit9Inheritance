import java.util.Scanner;

public class DiscussionBoardRunner {
    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();
        //User input to create posts (so the timer has different times!)
        Scanner s = new Scanner(System.in);
        //Super basic testing of the classes
        System.out.print("Msg Test 1 uname-mesg: ");
        String unameAndMesg = s.nextLine();
        int dashIndex = unameAndMesg.indexOf("-");
        String uname = unameAndMesg.substring(0,dashIndex);
        String msg = unameAndMesg.substring(dashIndex+1);
        MessagePost mp1 = new MessagePost(uname, msg);
        nf.addMessagePost(mp1);

        //Make a second post
        System.out.print("Msg Test 2 uname-mesg: ");
        unameAndMesg = s.nextLine();
        dashIndex = unameAndMesg.indexOf("-");
        uname = unameAndMesg.substring(0,dashIndex);
        msg = unameAndMesg.substring(dashIndex+1);
        MessagePost mp2 = new MessagePost(uname, msg);
        nf.addMessagePost(mp2);

        //Make a third post
        System.out.print("Msg Test 3 uname-mesg: ");
        unameAndMesg = s.nextLine();
        dashIndex = unameAndMesg.indexOf("-");
        uname = unameAndMesg.substring(0,dashIndex);
        msg = unameAndMesg.substring(dashIndex+1);
        MessagePost mp3 = new MessagePost(uname, msg);
        nf.addMessagePost(mp3);
        mp3.like();

        //Make a photo post
        System.out.print("Photos : uname-filename-caption: ");
        String unamePhotoCaption = s.nextLine();
        int dashIndex1 = unamePhotoCaption.indexOf("-");
        int dashIndex2 = unamePhotoCaption.indexOf("-",dashIndex1+1);
        uname = unamePhotoCaption.substring(0,dashIndex1);
        String photoName = unamePhotoCaption.substring(dashIndex1+1, dashIndex2);
        String caption = unamePhotoCaption.substring(dashIndex2+1);
        PhotoPost pp = new PhotoPost(uname, photoName, caption);
        nf.addPhotoPost(pp);
        System.out.println("Add comment: ");
        String comment = s.nextLine();
        pp.addComment(comment);
        pp.like();

        //Print them all
        System.out.println("++ Test run of the three posts: ++");
        nf.show();




    }


}