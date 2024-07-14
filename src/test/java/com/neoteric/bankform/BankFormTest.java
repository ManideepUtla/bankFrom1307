package com.neoteric.bankform;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BankFormTest {
    @Test
    public void banktest(){
        BankForm cooperativeForm=new BankForm();


        ApplicantDetails applicantDetails=new ApplicantDetails();

        applicantDetails.existingId=false;
        applicantDetails.entityName="Manideep Utla";

        Address address=new Address();
        address.communicationFlatNo="g1";
        address.communicationStreet="ManaStreet";
        address.communicationLandmark="Mana Mart";
        address.communicationCity="hyd";
        address.communicationPincode="500032";
        address.communicationState="TG";
        address.communicationCountry="India";

        address.residenceFlatNo=address.communicationFlatNo;
        address.residenceStreet= address.communicationStreet;
        address.residenceLandmark= address.communicationLandmark;
        address.residenceCity= address.communicationCity;
        address.residencePincode= address.communicationPincode;
        address.residenceState= address.communicationState;
        address.residenceCountry= address.communicationCountry;

        BusinessDetails businessDetails=new BusinessDetails();

        businessDetails.dateOfIncorporation="";
        businessDetails.dateOfCommencementOfBusiness="";
        businessDetails.countyOfIncorporation="";
        businessDetails.regNo="";
        businessDetails.pan="";
        businessDetails.placeOfIncorporation="";

        ConstitutionOfTheEntity constitution=new ConstitutionOfTheEntity();

        constitution.individual=true;
        constitution.proprietership=false;
        constitution.partnership=true;
        constitution.limitedPartnership=true;
        constitution.charitableTrust=false;
        constitution.privateLimitedCompany=true;
        constitution.trust=false;
        constitution.section25Companies=true;
        constitution.onePersonCompany=true;
        constitution.joint=false;
        constitution.other=false;

        ApplicantOperatingInstruction applicantInstruction=new ApplicantOperatingInstruction();
        applicantInstruction.soleProprietorshipAccounts=true;
        applicantInstruction.smsAlertFacility=false;
        applicantInstruction.chequeBookFacility=true;
        applicantInstruction.atmCard=true;
        applicantInstruction.singly=false;
        applicantInstruction.anyOne=false;
        applicantInstruction.jointlyByAll=true;
        applicantInstruction.anyOnePartner=true;
        applicantInstruction.asPerBondResolution=true;
        applicantInstruction.others=false;

        Introducer introducer=new Introducer();
        introducer.name="Manideep";
        introducer.accountNo="98765432456";
        introducer.communicationaddress=address;


        //linking of two classes

        cooperativeForm.applicantDetails=applicantDetails;
        cooperativeForm.comminicationAddress=address;
        cooperativeForm.residenceaAddress=address;
        cooperativeForm.businessDetails=businessDetails;
        cooperativeForm.constitutionOfTheEntity=constitution;
        cooperativeForm.applicantOperatingInstruction=applicantInstruction;
        cooperativeForm.introducer=introducer;


        //Assertions for test coverage

        Assertions.assertNotNull(cooperativeForm.applicantDetails);
        Assertions.assertNotNull(cooperativeForm.comminicationAddress);
        Assertions.assertNotNull(cooperativeForm.residenceaAddress);
        Assertions.assertNotNull(cooperativeForm.businessDetails);
        Assertions.assertNotNull(cooperativeForm.constitutionOfTheEntity);
        Assertions.assertNotNull(cooperativeForm.applicantOperatingInstruction);
        Assertions.assertNotNull(cooperativeForm.introducer);





    }
}
