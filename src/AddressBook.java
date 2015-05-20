/**
 * Created by student on 29.04.2015.
 */
public class AddressBook {
    Address [] list= new Address [100];
    int count=0;
    void add (Address newAddress){
        list [count]=newAddress;
        count++;
    }

    void printAll(){
        for (int i=0; i<count;i++){
            System.out.println(list[i]);
        }
    }

    void delete(int index){
        for (int i = index; i<count;i++)
            list [i-1] = list [i];
        list[count-1]=null;
        count--;
    }

    void edit (int index, String name, String phone, String email){
        list [index-1] = new Address(name, phone,email);
    }
}
