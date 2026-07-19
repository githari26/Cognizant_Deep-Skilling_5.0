class Cohort {
    constructor(
        cohortCode,
        startDate,
        technology,
        trainerName,
        coachName,
        currentStatus
    ) {
        this.cohortCode = cohortCode;
        this.coachName = coachName;
        this.trainerName = trainerName;
        this.technology = technology;
        this.startDate = startDate;
        this.currentStatus = currentStatus;
    }
}

const CohortsData = [
    new Cohort(
        'COGJFS2501',
        '15-Jan-2025',
        'Java Full Stack',
        'Rahul Sharma',
        'Karthik',
        'Ongoing'
    ),

    new Cohort(
        'COGRJS2502',
        '10-Feb-2025',
        'React JS',
        'Priya Nair',
        'Sneha',
        'Completed'
    ),

    new Cohort(
        'COGSPR2503',
        '18-Mar-2025',
        'Spring Boot',
        'Arjun Menon',
        'Vikram',
        'Ongoing'
    ),

    new Cohort(
        'COGAWS2504',
        '05-Apr-2025',
        'AWS Cloud',
        'Rohit Kumar',
        'Neha',
        'Scheduled'
    ),

    new Cohort(
        'COGAIM2505',
        '22-Apr-2025',
        'AI & Machine Learning',
        'Ananya Gupta',
        'Divya',
        'Ongoing'
    ),

    new Cohort(
        'COGDEV2506',
        '12-May-2025',
        'DevOps',
        'Akash Verma',
        'Sanjay',
        'Completed'
    ),

    new Cohort(
        'COGDS2507',
        '01-Jun-2025',
        'Data Science',
        'Aditya Joshi',
        'Meera',
        'Scheduled'
    ),
];

export { Cohort, CohortsData };