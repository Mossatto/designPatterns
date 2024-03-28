package ilp037.creational.builder;

public class Hero {
    private Armor armor;
    private HairColor hairColor;
    private Profession profession;

    public Hero(Armor armor, HairColor hairColor, Profession profession) {
        this.armor = armor;
        this.hairColor = hairColor;
        this.profession = profession;
    }

    public Hero() {

    }

    public Builder newBuilder(){
        return new Hero.Builder();
    }
    @Override
    public String toString() {
        return new StringBuilder()
                .append((this.armor != null ? this.armor : ""))
                .append((this.hairColor != null ? this.hairColor : ""))
                .append((this.profession != null ? this.profession : ""))
                .toString();
    }

    class Builder{
        private  Armor a;
        private HairColor hc;
        private Profession p;

        public Builder withArmor(Armor armor){
            this.a = armor;
            return this;
        }
        public Builder withHairColor(HairColor hairColor){
            this.hc = hairColor;
            return this;
        }
        public Builder withProfession(Profession profession){
            this.p = profession;
            return this;
        }
        public Hero build(){
            return new Hero(a,hc,p);
        }
    }
}
