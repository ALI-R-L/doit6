import java.util.ArrayList;

public class Patient {

    private String name;
    private String birthday;
    private String gender;
    private String normalInsurance;
    private String topInsurance;
    private String degree;
    private String location;
    private History history;
    private boolean permission;
    private ArrayList<Doctor> doctors;
    private DrugStore drugStore;
    private ArrayList<String> medicines;

    /**
     * Constructs a new patient
     */
    public Patient()
    {}

    /**
     * Sets patient's name
     */
    public void setName(String name)
    {}

    /**
     * Gets patient's name
     * @return
     */
    public String getName()
    {}

    /**
     * Sets patient's date of birth
     */
    public void setBirthday(String birthday)
    {}

    /**
     * Gets patient's date of birth
     * @return
     */
    public String getBirthday()
    {
    }

    /**
     * Sets patients gender
     */
    public void setGender(String gender)
    {}

    /**
     * sets patient gender
     */
    public String getGender() {

    }

    public void setInsurance(String insurance) {

    }
    public String getInsurance() {

    }

    public void setInsuranceType(String insuranceType) {

    }
    public String getInsuranceType() {

    }

    private void setDegree(String degree) {

    }
    public String getDegree() {

    }

    public void setLocation(String location)
    {}

    public String getLocation() {

    }

    /**
     * Returns history of patient
     * @return
     */
    public History getHistory() {

    }

    /**
     * Patient permits health center to get their name or not.
     */
    public void setPermission(boolean permission) {

    }

    /**
     * Finds first trusted doctor
     * @return
     */
    public Doctor trustedDoc() {

    }

    /**
     * If patient needs a new doctor for their illness this method calls
     * and add a new related doctor to trusted list
     */
    public void addDoctor(Doctor doctor)
    {}

    /**
     * Patient can understand what medicines should buy for their illness
     */
    public void buyMedicine(DrugStore drugStore)
    {}

}
