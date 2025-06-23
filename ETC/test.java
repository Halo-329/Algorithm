import java.util.*;


class test {


    public static void main(String args[]) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        HashMap<String, Integer> total_play_info = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> musics = new HashMap<>();


        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int id = i;
            int play_cnt = plays[i];

            total_play_info.put(genre, total_play_info.getOrDefault(genre, 0) + plays[i]);
            HashMap<Integer, Integer> music = musics.getOrDefault(genre, new HashMap<>());
            music.put(id, play_cnt);
            musics.put(genre, music);


        }

        System.out.println(musics);


    }
}