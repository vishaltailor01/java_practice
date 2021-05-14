package programmes;

public class PlayingCat {


    public boolean isCatPlaying(Boolean summer, int temprerature) {
        if (summer) {
            if (temprerature >= 25 && temprerature <= 35) {
                return true;

            } else
                return false;
        } else {
            if (temprerature >= 25 && temprerature <= 35) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        PlayingCat a = new PlayingCat();
        System.out.println(a.isCatPlaying(true, 10));
        System.out.println(a.isCatPlaying(false, 36));
    }


}