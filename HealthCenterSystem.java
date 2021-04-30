import java.util.ArrayList;

public class HealthCenterSystem {

    //list of patients
    private ArrayList<Patient> patients;
    //list of universities that can access to information
    private ArrayList<University> universities;
    /**
     * Constructor to make a new Health center system
     */
    public HealthCenterSystem()
    {}

    /**
     * Adds a new patient
     * @param patient as new patient
     */
    public void addPatient(Patient patient)
    {}

    /**
     * Checks if universities can access to name of the patient
     * @return
     */
    public boolean accessPermission()
    {}

    /**
     * Gets people information with their name if it is possible
     * @return
     */
    public Patient peopleAllInfo()
    {}

    /**
     * Gets people information without their name
     * @return
     */
    public History peopleInfo()
    {}

    /**
     * Checks the name of a university and if it was in the list then they can access to information
     * @return
     */
    public boolean checkUniversity()
    {return true;}
}
