public interface HospitalFunctional {
    void register(Patient patient);
    void registerToADoctor(Patient patient, String doctor);
    void setAContract(Patient patient);
    void deleteAContract(Patient patient);
    void updateDiagnose(Patient patient, String diagnose);
    void getLaboratoryResearch(String research);
}
