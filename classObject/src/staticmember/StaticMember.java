package staticmember;

public class StaticMember {
    public static int id = 1000;
    public static String MESSAGE = "Hello";

    public int mId;
    public StaticMember() {
        mId = id++;
        showStaticId();
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
    public static void showStaticId(){
        System.out.println("static id = " + id);
    }

    public static void main(String[] args) {
        StaticMember s1 = new StaticMember();
        StaticMember s2 = new StaticMember();
        StaticMember s3 = new StaticMember();
        StaticMember s4 = new StaticMember();

//        System.out.println("s1 id " + s1.getmId());
//        System.out.println("s2 id " + s2.getmId());
//        System.out.println("s3 id " + s3.getmId());
    }
}
