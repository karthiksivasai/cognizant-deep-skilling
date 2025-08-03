import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = () => {
  const cohorts = [
    {
      id: "INTADMDF10 -.NET FSD",
      startedOn: "22-Feb-2022",
      currentStatus: "Scheduled",
      coach: "Aathma",
      trainer: "Jojo Jose"
    },
    {
      id: "ADM21JF014 -Java FSD",
      startedOn: "10-Sep-2021",
      currentStatus: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith"
    },
    {
      id: "CDBJF21025 -Java FSD",
      startedOn: "24-Dec-2021",
      currentStatus: "Ongoing",
      coach: "Aathma",
      trainer: "John Doe"
    }
  ];

  const getStatusColor = (status) => {
    return status === "Ongoing" ? "green" : "blue";
  };

  return (
    <div>
      <h1>Cohorts Details</h1>
      {cohorts.map((cohort, index) => (
        <div key={index} className={styles.box}>
          <h3 style={{ color: getStatusColor(cohort.currentStatus) }}>
            {cohort.id}
          </h3>
          <dl>
            <dt>Started On:</dt>
            <dd>{cohort.startedOn}</dd>
            <dt>Current Status:</dt>
            <dd>{cohort.currentStatus}</dd>
            <dt>Coach:</dt>
            <dd>{cohort.coach}</dd>
            <dt>Trainer:</dt>
            <dd>{cohort.trainer}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
};

export default CohortDetails; 