package org.ftninformatika.termin20_vezba;

import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private List<Glumac> glumci;
    private List<Filmovi> filmovi;
    private static DataProvider instance;

    public static DataProvider getInstance(){
        if (instance == null){
            instance = new DataProvider();
        }
        return instance;
    }

    DataProvider(){
        fillGlumci();
        fillFilmovi();
    }

    private void fillGlumci(){
        glumci=new ArrayList<>();
        glumci.add(new Glumac(1,"Leonardo","Dikaprio","Oskarovac","leonardo.jpg",3.0f,"01.01.2020.","01.01.3000.",getFilmoviId()));
        glumci.add(new Glumac(2,"Nikola","Djuricko","Oskarovac","nikola.jpg",5.0f,"01.02.2020.","01.02.3000.",getFilmoviId()));
        glumci.add(new Glumac(3,"Nikola","Kojo","Oskarovac","kojo.jpg",4.0f,"01.03.2020.","01.03.3000.",getFilmoviId()));
        glumci.add(new Glumac(4,"Vladimir","Brstina","Oskarovac","vladimir.jpg",4.0f,"01.04.2020.","01.04.3000.",getFilmoviId()));
        glumci.add(new Glumac(5,"Dimitrije","Banjac","Oskarovac","dimitrije.jpg",4.0f,"01.05.2020.","01.05.3000.",getFilmoviId()));
        glumci.add(new Glumac(6,"Zan Klod","Van Dam","Oskarovac","zanklod.jpg",3.0f,"01.06.2020.","01.06.3000.",getFilmoviId()));
    }

    private void fillFilmovi(){
        filmovi=new ArrayList<>();
        filmovi.add(new Filmovi(1,"Vratice se rode"));
        filmovi.add(new Filmovi(2,"Senke nad balkanom"));
        filmovi.add(new Filmovi(3,"Montevideo"));
        filmovi.add(new Filmovi(4,"Bolji zivot"));
        filmovi.add(new Filmovi(5,"Bela ladja"));
        filmovi.add(new Filmovi(6,"Umri muski"));
        filmovi.add(new Filmovi(7,"Titanik"));

    }

    private List<Integer> getFilmoviId(){
        List<Integer> filmoviId=new ArrayList<>();
        for(int i=1;i<8;i++){
            filmoviId.add(i);
        }
        return filmoviId;
    }


    public Filmovi getFilmoviById(int id){
        switch (id){
            case 1:
                return filmovi.get(0);
            case 2:
                return filmovi.get(1);
            case 3:
                return filmovi.get(2);
            case 4:
                return filmovi.get(3);
            case 5:
                return filmovi.get(4);
            case 6:
                return filmovi.get(5);
            case 7:
                return filmovi.get(6);
            default:
                return null;
        }
    }

    public Glumac getGlumacById(int id){
        switch (id){
            case 1:
                return glumci.get(0);
            case 2:
                return glumci.get(1);
            case 3:
                return glumci.get(2);
            case 4:
                return glumci.get(3);
            case 5:
                return glumci.get(4);
            case 6:
                return glumci.get(5);

            default:
                return null;
        }
    }


    public List<Glumac> getGlumci() {
        return glumci;
    }

    public List<Filmovi> getFilmovi() {
        return filmovi;
    }

}
