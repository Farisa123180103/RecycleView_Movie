package com.example.movie;

import java.util.ArrayList;

public class MovieData {

    private static String[] judul =
            {"Orang Kaya Baru","After Met You","Dear Nathan","The Devil Below",
                    "May Who?","The Curse","Dear Nathan Hello Salma","A Quite Place",
                    "Imperfect","Millions"};

    private static String[] director =
            {"Ody C. Harahap","Patrick Effendy","Indra Gunawan","Bradley Parker",
                    "-","Muhammad Yusuf","Indra Gunawan","John Krasinski",
                    "Ernest Prakasa, Meira Anastasia, Raya Gumelar, Rieviena Yulieta",
                    "Danny Boyle"};

    private static String[] starring =
            {"Raline Shah, Cut Mini, Derby Romero, Fatih Unru, Lukman Sardi, Refal Hady",
                    "Ari Irham, Yoriko Angeline, Michelle Wanda, Naufan Raid Azka, Yudha Keling, Chicco Kurniawan",
                    "Amanda Rawles, Jefri Nichol",
                    "Adan Canto, Alicia Sanz, Alpha Trivette, Ana Iglesias, Apollo Bacala, Bayland Rippenkroeger, Chinaza Uche, Christopher Padilla, Damon Sudduth, Duncan Novak",
                    "Kanyawee Songmuang, Narikun Ketprapakorn, Sutatta Udomsilp, Thanapob Leeratanakajorn, Thiti Mahayotaruk",
                    "-","Amanda Rawles, Devano Danendra, Diandra Agatha, Gito Gilas, Jefri Nichol, Karina Suwandi, Shandy William, Surya Saputra, Susan Sameh",
                    "Cade Woodward, Emily Blunt, John Krasinski, Millicent Simmonds, Noah Jupe",
                    "Aci Resti, Ardit Erwandha, Asri Welas, Boy William, Cathy Sharon, Clara Bernadeth, Devina Aureel, Dewi Irawan, Diah Permatasari, Dion Wiyoko",
                    "Alexander Nathan Etel, Alice Grice, Alun Armstrong, Billy Hyland, Christian Rubeck, Christopher Fulford, Christy Cullen, Cornelius Macarthy, Daisy Donovan, Dale Stringer"};

    private static String[] genre =
            {"Comedy,Drama","Drama","Drama, Romance","Horror, Thriller",
                    "Comedy, Romance","Horror","Drama, Romance","Drama, Horror, Science Fiction, Thriller",
                    "Comedy, Drama","Comedy, Crime, Drama, Family"};

    private static String[] sinopsis =
            {"This is a story about sudden wealth. Tika, Duta, Dodi, and their mother used to live simple lives as they are. When his father died, it was revealed that apparently all this time his father was a wealthy man. They also get inheritance in the form of assets that they never imagined. The family is now trying to enjoy their abundant wealth. Will their weatlh be a blessing or turns into a tough test for this family?",
                    "Ari, the coolest and most handsome guy at his school, is challenged by his friends, The Daks, to find a girlfriend who is definitely not interested in him. Ara, an introverted and smart girl in school, is Ari's target. It turns out that Ara is the daughter of Ari’s producer as a DJ. Ari is shocked because all of Ara's views about him. This make him question himself. Azka, Ari's old friend, then moves to Ari’s school and close to Ara. Ari, who tries to hide his inner wounds because of his family's condition, also has to try to win Ara's heart. The truth about the betting is finally revealed",
                    "A love story between a bad boy named Nathan, and a girl named Salma. Nathan also have to deal with his family problem.",
                    "A group of four amateur adventurers who specialize in exploring remote and forsaken places pay a visit to Shookum Hills, a town in the remote Appalachian Mountains which was abandoned decades ago due to a mysterious coal mine fire.",
                    "Pong is a high-school geek who belongs to a group of high school outcasts known as the “Invisibles”, and enjoys letting his imagination run wild by drawing cartoons. May-Who is also one of the “Invisibles” and has an extraordinary secret: an ability to discharge electricity like a Tesla coil. Whenever her heart beats faster than 120 beats per minute her body releases a powerful electricity charge. Pong accidentally learns about this and promises to keep it a secret in exchange for helping each other win over their own high-school crushes",
                    "An expatriate lawyer girl from Indonesia who working in Australia got message from ghost spirit.",
                    "Salma’s father forbid his daughter’s relationship with Nathan, and instead he arranges to set up Salma with Ridho. Eventually Salma and Nathan broke up, and Nathan has to move to a new school where he meets Rebecca",
                    "A family is forced to live in silence while hiding from creatures that hunt by sound.",
                    "As a cosmetics company employee deals with insecurities about her body image, she considers a transformation for a chance at a promotion.",
                    "Two boys, still grieving the death of their mother, find themselves the unwitting benefactors of a bag of bank robbery loot in the week before the United Kingdom switches its official currency to the Euro. What’s a kid to do?"};

    private static int[] gambar =
            {R.drawable.okb,R.drawable.amy,R.drawable.dn_1,R.drawable.tdb,R.drawable.mw,R.drawable.tc,R.drawable.dn_2,R.drawable.qp,R.drawable.ip,R.drawable.ml};

    public static ArrayList<MovieModel> getListData(){
        MovieModel movieModel = null;
        ArrayList<MovieModel> list = new ArrayList<>();
        for (int i = 0; i <judul.length; i++){
            movieModel = new MovieModel();
            movieModel.setJudul(judul[i]);
            movieModel.setGenre(genre[i]);
            movieModel.setDirector(director[i]);
            movieModel.setStarring(starring[i]);
            movieModel.setGambar(gambar[i]);
            movieModel.setSinopsis(sinopsis[i]);
            list.add(movieModel);
        }
        return list;
    }
}
