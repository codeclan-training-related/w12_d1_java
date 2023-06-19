public class Bear {

    private String species;
    private int age;
    private double weight;
    private boolean readToHibernateOver90kg;


//    constructor
    public Bear (String species, int age, double weight){
        this.species = species;
        this.age = age;
        this.weight=weight;
    }
//    getter
    public String getSpecies(){
        return this.species;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean isReadToHibernateOver90kg(){
        if(this.weight >= 90){
            return true;} else {
            return false;
        }}


}
