use evae;
-- Table 'USER'
CREATE TABLE user (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      nom VARCHAR(255) NOT NULL,
                      email VARCHAR(255) NOT NULL,
                      password VARCHAR(255) NOT NULL,
                      code_prof VARCHAR(255),
                      role ENUM ('ADMIN', 'ETUDIANT', 'ENSEIGNANT') NOT NULL
);
-- Table 'FORMATION'
CREATE TABLE formation (
                           CODE_FORMATION VARCHAR(8) NOT NULL,
                           DIPLOME VARCHAR(3) NOT NULL,
                           N0_ANNEE INT(1) DEFAULT 1 NOT NULL,
                           NOM_FORMATION VARCHAR(64) NOT NULL,
                           DOUBLE_DIPLOME CHAR(1) NOT NULL,
                           DEBUT_HABILITATION DATE,
                           FIN_HABILITATION DATE,
                           PRIMARY KEY (CODE_FORMATION)
);

-- Table 'PROMOTION'
CREATE TABLE promotion (
                           ANNEE_PRO VARCHAR(10) NOT NULL,
                           CODE_FORMATION VARCHAR(8),
                           NO_ENSEIGNANT INT(5),
                           SIGLE_PRO VARCHAR(5) NOT NULL,
                           NB_ETU_SOUHAITE INT(3) NOT NULL,
                           ETAT_PRESELECTION VARCHAR(3) NOT NULL,
                           DATE_RENTREE DATE,
                           LIEU_RENTREE VARCHAR(255),
                           DATE_REPONSE_LP DATE,
                           COMMENTAIRE VARCHAR(255),
                           DATE_REPONSE_LALP DATE,
                           PROCESSUS_STAGE VARCHAR(5) DEFAULT 'RECH',
                           NO_EVALUATION INT,
                           NO_BAREME INT,
                           PRIMARY KEY (ANNEE_PRO),
                           FOREIGN KEY (CODE_FORMATION) REFERENCES formation(CODE_FORMATION) ON DELETE SET NULL
);
-- Table 'ETUDIANT'
CREATE TABLE etudiant (
                          NO_ETUDIANT_NAT VARCHAR(50) NOT NULL,
                          ANNEE_PRO VARCHAR(10) NOT NULL,
                          CODE_COM VARCHAR(10),
                          NO_ETUDIANT_UBO VARCHAR(20),
                          SEXE CHAR(1) NOT NULL,
                          NOM VARCHAR(50) NOT NULL,
                          PRENOM VARCHAR(50) NOT NULL,
                          DATE_NAISSANCE DATE NOT NULL,
                          LIEU_NAISSANCE VARCHAR(255) NOT NULL,
                          SITUATION VARCHAR(3) NOT NULL,
                          NATIONALITE VARCHAR(50) DEFAULT 'Française' NOT NULL,
                          TEL_PORT VARCHAR(20),
                          TEL_FIXE VARCHAR(20),
                          EMAIL VARCHAR(255),
                          ACTU_ADRESSE VARCHAR(255),
                          ACTU_CP VARCHAR(10),
                          ACTU_VILLE VARCHAR(255),
                          ACTU_PAYS VARCHAR(255),
                          PERM_ADRESSE VARCHAR(255) NOT NULL,
                          PERM_CP VARCHAR(10) NOT NULL,
                          PERM_VILLE VARCHAR(255) NOT NULL,
                          PERM_PAYS VARCHAR(255) NOT NULL,
                          DERNIER_DIPLOME VARCHAR(255) NOT NULL,
                          UNIVERSITE VARCHAR(255) NOT NULL,
                          SIGLE_ETU VARCHAR(3) NOT NULL,
                          COMPTE_CRI VARCHAR(10) NOT NULL,
                          UBO_EMAIL VARCHAR(255),
                          GRPE_ANGLAIS TINYINT(1),
                          ABANDON_MOTIF VARCHAR(255),
                          ABANDON_DATE DATE,
                          EST_DIPLOME CHAR(1) DEFAULT 'N',
                          PRIMARY KEY (NO_ETUDIANT_NAT),
                          FOREIGN KEY (ANNEE_PRO) REFERENCES promotion(ANNEE_PRO)
);




INSERT INTO formation VALUES
                          ('FORM1', 'M', 1, 'Computer Science', 'N', '2023-01-01', '2025-01-01'),
                          ('FORM2', 'B', 1, 'Business Administration', 'N', '2022-01-01', '2024-01-01');

INSERT INTO promotion VALUES
                          ('2024', 'FORM1', 12345, 'PRO1', 100, 'PRE', '2024-09-01', 'University Campus', '2024-06-15', 'Great students', '2024-06-20', 'STAGE', 1, 100),
                          ('2023', 'FORM2', 67890, 'PRO2', 80, 'PRE', '2023-09-01', 'Business School', '2023-06-15', 'Excellent program', '2023-06-20', 'STAGE', 2, 90);


INSERT INTO etudiant VALUES
                         ('12345', '2024', 'COM1', 'UBO123', 'M', 'Dupont', 'Jean', '1990-05-15', 'Paris', 'C', 'Française', '0123456789', '0123456789', 'jean.dupont@email.com', '123 Street, City', '75001', 'Paris', 'France', '456 Street, City', '75002', 'Lyon', 'France', 'Master', 'University X', 'X01', 'CRI789', 'jean.ubo@email.com', 1, 'Personal reasons', '2024-01-10', 'Y'),
                         ('67890', '2023', 'COM2', 'UBO456', 'F', 'Martin', 'Sophie', '1992-08-22', 'Marseille', 'C', 'Française', '0987654321', '0987654321', 'sophie.martin@email.com', '789 Street, City', '13001', 'Marseille', 'France', '987 Street, City', '13002', 'Nice', 'France', 'Bachelor', 'University Y', 'Y02', 'CRI123', 'sophie.ubo@email.com', 2, NULL, NULL, 'N');
