class Family {
    public static void main(String[] args) {
        MainFamily mainFamily = new MainFamily();
        VermaFamily sunny = new VermaFamily();
        TanwarFamily tanwarFamily = new TanwarFamily();
        TanwarFamily tanwarFamily2 = new TanwarFamily("Bunny");
        TanwarFamily tanwarFamily3 = new TanwarFamily("Lallu");
        TanwarFamily tanwarFamily4 = new TanwarFamily("PP");

        GulatiFamily gulatiFamily = new GulatiFamily();

        mainFamily.introduce();
        sunny.introduce();
        tanwarFamily.introduce();
        tanwarFamily2.introduce();
        tanwarFamily3.introduce();
        tanwarFamily4.introduce();
        gulatiFamily.introduce();

    }
}

class MainFamily {
    protected String familyName;
    protected String ownName;

    MainFamily() {
        familyName = "Main";
        ownName = "No Name";
    }


    public void introduce() {

        if (this.ownName != "No Name") {
            System.out.println("Hello, I am " + this.ownName + " from the " + this.familyName + " family!");
        } else {
            System.out.println("Hello, I am from the " + this.familyName + " family!");
        }
    }
}

class VermaFamily extends MainFamily {
    VermaFamily() {
        familyName = "Verma";
        ownName = "Lakshay";
    }

}

class TanwarFamily extends MainFamily {
    TanwarFamily() {
        familyName = "Tanwar";
        ownName = "Anjali";
    }

    TanwarFamily(String name) {
        familyName = "Tanwar";
        ownName = name;
    }
}

class GulatiFamily extends MainFamily {
    GulatiFamily() {
        familyName = "Gulati";
        ownName = "Kashish";
    }
}
