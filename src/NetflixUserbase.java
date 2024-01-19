public class NetflixUserbase {
    private final int userID;
    private String subscriptionType;
    private String monthlyRevenue;
    private final String joinDate;
    private String lastPaymentDate;
    private String country;
    private int age;
    private String gender;
    private String device;

    @Override
    public String toString() {
        return "NetflixUserbase{" +
                "userID=" + userID +
                ", subscriptionType='" + subscriptionType + '\'' +
                ", monthlyRevenue='" + monthlyRevenue + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", lastPaymentDate='" + lastPaymentDate + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", device='" + device + '\'' +
                ", planDuration='" + planDuration + '\'' +
                '}';
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public void setMonthlyRevenue(String monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }

    public int getUserID() {
        return userID;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public String getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDevice() {
        return device;
    }

    public String getPlanDuration() {
        return planDuration;
    }

    private String planDuration;

    public NetflixUserbase(int userID, String subscriptionType, String monthlyRevenue, String joinDate, String lastPaymentDate, String country, int age, String gender, String device, String planDuration) {
        this.userID = userID;
        this.subscriptionType = subscriptionType;
        this.monthlyRevenue = monthlyRevenue;
        this.joinDate = joinDate;
        this.lastPaymentDate = lastPaymentDate;
        this.country = country;
        this.age = age;
        this.gender = gender;
        this.device = device;
        this.planDuration = planDuration;
    }
}
