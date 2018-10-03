package person;

import java.util.ArrayList;
import java.util.List;

public class people {


    private  person person;

    ArrayList<person> body = new ArrayList<person>();

        public  void add(person P){

            body.add(P);
        }

        public void finfById (long id){

            for ( person p: body) {

                person.findid();
            }
        }


            public void remove(long i){

                if( person.id == i){

                    body.remove(person);
                }
            }


            public void remove(person P){

            if (person == P)

                body.remove(P);

            }




            public int getCount(){

            return body.size();
            }









}
