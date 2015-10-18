import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
@Entity
@Table(name = "cha")
public class Char {
    
    @Id
    @GeneratedValue
    private Integer id;
	private String charname;
    private String title;
    private String language;
    private String race;
    private String classtype;
    private String ability1;
    private String ability2;
    private String ability3;
    
    public Char() {
    	
    }
    
    public String toString() {
        return "Char [id=" + id + ", charname=" + charname + ", title=" + title + ", language=" + language + ", race=" + race + ", classtype=" + classtype + ", ability1=" + ability1 + ", ability2=" + ability2 + ", ability3=" + ability3 + ",]";
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCharname() {
		return charname;
	}

	public void setCharname(String charname) {
		this.charname = charname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getClasstype() {
		return classtype;
	}

	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}

	public String getAbility1() {
		return ability1;
	}

	public void setAbility1(String ability1) {
		this.ability1 = ability1;
	}

	public String getAbility2() {
		return ability2;
	}

	public void setAbility2(String ability2) {
		this.ability2 = ability2;
	}

	public String getAbility3() {
		return ability3;
	}

	public void setAbility3(String ability3) {
		this.ability3 = ability3;
	}
}