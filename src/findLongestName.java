import java.util.Scanner;

public class findLongestName {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap so nguoi ban");
        int n = input.nextInt();
        var friends=insertFriend(n,input);
        var maxLength=findLongestName(friends);
        showResult(friends,maxLength);



    }

    private static String[] insertFriend(int n, Scanner input) {
        String[] friendList = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten nhung nguoi ban di");
            friendList[i] = input.next();
        }
        return friendList;
    }

    private static void showFriendList(String[] friendList) {
        System.out.println("List friend cua ban day ne");
        for (var friend : friendList) {
            System.out.println(friend + "  ");
        }
    }

    private static int findLongestName(String[] friendList) {
        var max = 0;
        for (int i = 0; i < friendList.length; i++) {
            if (friendList[i].length() > max) {
                max = friendList[i].length();
            }


        }
        return max; }
    private static void showResult(String[] friendList,int max){
        for (int i = 0; i < friendList.length; i++) {
            if (friendList[i].length() == max) {

                System.out.println("ten dai nhat la "+ friendList[i]);
            }

        }

    }



}
