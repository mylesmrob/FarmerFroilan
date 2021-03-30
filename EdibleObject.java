package farmerlab;

public class EdibleObject implements IEater{


    public String object;

   public void setEdibleObject(String object){
       this.object = object;
   }

    public void EdibleObject(String name) {
        System.out.println(name);
    }


    @Override
    public String toString() {
        return "EdibleObject{" +
                "object='" + object + '\'' +
                '}';
    }


    @Override
    public void eat() {
        System.out.println("SOme food");
    }



}
