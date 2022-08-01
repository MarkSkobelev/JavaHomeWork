package lesson5_2;

import java.util.ArrayList;
import java.util.List;

public class Music {

    private int[] howManyListened;
    private String[] singers;
    private String[] songs;

    private String genre;

    public Music() {

        this.singers = new String[]{"Linkin Park", "Tchaikovsky", "Tyga", "Nickelback", "Govi", "Everlast"};
        this.songs = new String[]{"Havana Sunset ", "Savin'Me", "Blacbirds", "Rnw@y", "Mydsmbr", "Angel", "Blinded By The Sun", "Stay", "Someday", "I get By", "Battle Symphony", "Sheikh Talk", "Loco Contigo", "Good Goodbye", "Lonley Road", "Swan Lake", "The Nutcracker", "Castle of glass", "Romeo and Juliet", "Buddha Nature", "Over the moon", "Tears of joy", "Start your stuff", "Passage to Paradise", "Euphrates", "Serenade D'Amor", "Gypsy Heart", "Bless you", "Young and brave", "Simple", "Bottoms up", "Summer", "With you", "When they come for me", "Sharp", "Exit", "Gift", "Defeat", "Winner", "Victory", "Quiz", "Fifa", "Telega", "Belly", "Knowledge", "AS far as i know", "Celebrate", "Person", "Dream", "English", "Disney", "Silent", "Night", "Tiger", "Amazon", "Fish", "Mac", "MC", "Fair", "Animoto", "Selfish", "Game", "Juicy", "Tell Santa", "Real Deal", "Too many", "Swish", "Ibiza", "Dip", "Lift me up", "Taste", "Lost in the Echo", "Sky", "How you remind me", "Never gonna be alone", "Faint", "Blackbirds"};
        this.howManyListened = new int[songs.length];
        for (int i = 0; i < songs.length; i++) {

            this.howManyListened[i] = (int) (Math.random() * 1001);
        }
    }

    public Music(String genre, String[] singers, String[] songs, int[] listened) {

        this.genre = genre;
        this.singers = singers;
        this.songs = songs;
        this.howManyListened = listened;

    }

    public String GetGenre() {

        return this.genre;

    }

    public String[] GetAllSongs() {

        return songs;

    }

    public String[] GetAllSingers() {

        return singers;

    }

    public int[] GetListened() {

        return howManyListened;
    }

    public void ShowMusic () {

        System.out.println(this.genre);
        for (int i = 0; i < songs.length; i++) {

            System.out.printf("%s - singer; %s - name of song; %d - numbers of auditions\n", singers[i], songs[i], howManyListened[i]);

        }
    }

    public void RemoveUsed(int index) {

        List<String> newListSong = new ArrayList<>(songs.length - 1);
        List<Integer> newListenedList = new ArrayList<>(howManyListened.length - 1);

        for (int i = 0; i < songs.length; i++) {

            if (i != index) {

                newListSong.add(songs[i]);
                newListenedList.add(howManyListened[i]);

            }

        }

        this.howManyListened = newListenedList.stream().mapToInt(i -> i).toArray();
        this.songs = newListSong.toArray(new String[0]);

    }

    public void SortGenreList() {

        int tempListened;
        String tempSingers;
        String tempSongs;

        for (int i = 0; i < songs.length; i++) {

            int max = howManyListened[i];
            int indexMax = i;
            tempSongs = songs[i];
            tempSingers = singers[i];
            tempListened = howManyListened[i];

            for (int j = i; j < songs.length; j++) {

                if (max < howManyListened[j]) {

                    indexMax = j;
                    max = howManyListened[j];

                }
            }

            songs[i] = songs[indexMax];
            singers[i] = singers[indexMax];
            howManyListened[i] = howManyListened[indexMax];

            songs[indexMax] = tempSongs;
            singers[indexMax] = tempSingers;
            howManyListened[indexMax] = tempListened;

        }

    }

}