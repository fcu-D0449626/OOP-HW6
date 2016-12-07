package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private String name;
    public int cp;
    private PokemonType type;
    
    

	public String getname(){
    	return name;
}
    public PokemonType gettype(){
    	return type;
    }
    public int getcp(){
    	return cp;
    }
    public void setcp(int CP){
    	cp=CP;
    }
     
    public Pokemon(String name,PokemonType type,int CP){
    	super();
        this.name=name;
        this.type=type;
        this.cp=CP;
    }
}
