public class Instagram {
    public void Watch(){
        System.out.println("watch reels and learning videos!");
    }

    public void Upload(){
        System.out.println("upload photos,videos,stories and reels!");
    }
}

class userA extends Instagram{
    public void CreateAccount(String a,String b){
        System.out.println("Enter your user name: "+ a);
        System.out.println("Enter your password: "+b);
    }
}
class userB extends userA{
    public void CreateAccount(String a,String b){
        userA obj = new userA();
        super.CreateAccount(a,b);
        obj.Watch();
        obj.Upload();
    }
}

