package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job extends JobField{

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getName(String name) {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        if (this.getId() <= 0) {
            return "ID: " + "Data not available" + "\n" + "Name: " + this.getName() + "\n" + "Employer: " + this.getEmployer() + "\n" + "Location: " + this.getLocation() + "\n" + "Position Type: " + this.getPositionType().getValue() + "\n" + "Core Competency: " + this.getCoreCompetency() + "\n";
        }
        if (this.getName().isEmpty()) {
            this.name = "Data not available";
        } else if (this.getEmployer().getValue().isEmpty()) {
            this.employer.setValue("Data not available");
        } else if (this.getLocation().getValue().isEmpty()) {
            this.location.setValue("Data not available");
        } else if (this.getPositionType().getValue().isEmpty()) {
            this.positionType.setValue("Data not available");
        } else if (this.getCoreCompetency().getValue().isEmpty()) {
            this.coreCompetency.setValue("Data not available");
        }
        return "\n" + "ID: " + this.getId() + "\n" + "Name: " + this.getName() + "\n" + "Employer: " + this.getEmployer() + "\n" + "Location: " + this.getLocation() + "\n" + "Position Type: " + this.getPositionType().getValue() + "\n" + "Core Competency: " + this.getCoreCompetency() + "\n";

        // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
        //  and id.
    }
}
