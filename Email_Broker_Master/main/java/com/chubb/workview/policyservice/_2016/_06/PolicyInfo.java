
package com.chubb.workview.policyservice._2016._06;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PolicyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyCoverRequest" type="{http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts}ArrayOfCoverageRequest" minOccurs="0"/>
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicySite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityPolicyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSensitive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrimaryLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryInsurer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommissionPercentEL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionPercentOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WrittenLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SignedLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InceptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RiskReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryofRiskID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BusinessDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcessedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PolicyGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesPersonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardIndustrialClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardIndustrialClassificationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="portfolioSubclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UWSRiskNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UWSRiskVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BackendLockedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Syndicate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SignedOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalExposure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuotedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotTakenupDeclineReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillingMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterPolIntID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PACPR_CD_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POCULL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CoInsurenceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HistoricalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POCUPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReInsurenceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SISBrokerCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SISInsuredCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExclusiveFlagID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProgrammeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FreedomofServicesFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderwriterArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OFACCheckDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MeridianRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndorsementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DDMandateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextPremiumDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NextPremiumAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InsurancePremiumTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RenewalFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GENNEXTpolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitMultiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AccountHandlerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AceShare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BackendID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BackendID2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplaintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ComplaintReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsComplaint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Is_Migrated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessGroupCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NationalAssociationofInsuranceCommissionersTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentStatusID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyShare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreventSendtoBackend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RenewalType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalAceSharePremium" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VNAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectAssumed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DistributionChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PremiumType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RenewalBusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENNEXTLockID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TacitlyRenewedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Leader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingSourceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BoundBenchMark" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RateChange" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExpaceShare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ContributionFactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MajorLineID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingBranchRisk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingPMRisk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NationalAssociationofInsuranceCommissionersCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingPM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyPremiumAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SanctionCheck" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NationalAssociationofInsuranceCommissionersDescription" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PortfolioClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalAssociationofInsuranceCommissionersExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineofBusiness" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MarketingCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AgencyorZoneCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LiqDifCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuredNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PolicyHolderNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdjustmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndexUpdate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RefreshRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BonusBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecoveryofExpensesorShares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PilotCompanyCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PolicyNumberPilotCompany" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReinsurerCompanyCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperationCodeWithoutReserve" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Collecting" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtCollectorCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentConditionCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmissionChange" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CapitalInsuredorOwnParty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Financing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizerCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProducerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentageVariationSubstringers" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PremiumModificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrativeStringers" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IssuingRights" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountSocialService" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountSuperBankingRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InternalAmountOwnParty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Sealed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalBonus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalPrizeExternalCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalPrizeUSD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceExternalCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceUSD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PremiumGYH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceCollectionExternalCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceCollectionUSD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalDifferentialCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceCommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceDifferentialCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentageAquisitionsExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferencePolicy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceEndorsement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CancelledOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastInstallmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReasonForMovement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequencyRebilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MorABase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocumentPerCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentCollection1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionorCollection1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionorCollection1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentCollection2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionorCollection2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionorCollection2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentageCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Camp02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentageEarthquakeCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PolicyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Periodicity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TypeofInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeofBusiness" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="YearorMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TypeofAssurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndemnityPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BusinessInterruption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccommodationPolicy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AccountingIndicatorPremiumPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeneficiaryNit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentagePortionLeader" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentageCoInsuranceCeded" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CoverageExtention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoInsuranceCeded" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LOBReference" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PolicyReference" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentageBusinessInterruption" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdditionalExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StartingReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FinishingReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="GrossTaxes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CivilEngineeringTerm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TypeofAssembly" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AgencyBillingSerialNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillingConsecutiveNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RenovationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PolicyMarkOLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeofMaintenance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaintenanceStartingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaintenanceFinishingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaintenanceTerms" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StartingTestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FinishingTestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TestTerm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StartingProdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FinishingProdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ProdTerm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BrokerOperationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AppendixRelated" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MultinationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BalanceIvaValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalanceExpressValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BalancePremium" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BusinessSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdateDatabase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterfMark_I" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENDRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldOfficeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PolicyEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InsuredCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderwriterAreaShortname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PACPRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BusinessProcessingUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DirectAssumedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExclusiveFlagCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreedomofServicesFlagCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuredID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyStateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrefixID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrefixMid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProgrammeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnderwriterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyInfo", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", propOrder = {
    "policyCoverRequest",
    "policyNumber",
    "policySite",
    "entityCode",
    "masterPolicyNumber",
    "securityPolicyID",
    "policyTypeID",
    "isSensitive",
    "primaryLimit",
    "primaryInsurer",
    "commissionPercentEL",
    "commissionPercentOther",
    "writtenLine",
    "signedLine",
    "inceptionDate",
    "riskReferenceNo",
    "countryofRiskID",
    "businessDescription",
    "segmentID",
    "processedBy",
    "createdDate",
    "policyGUID",
    "productCode",
    "salesPersonID",
    "standardIndustrialClassificationCode",
    "standardIndustrialClassificationID",
    "portfolioSubclass",
    "insuredName",
    "uwsRiskNumber",
    "uwsRiskVersion",
    "backendLockedFlag",
    "syndicate",
    "signedOrder",
    "totalLine",
    "totalExposure",
    "quotedDate",
    "notTakenupDeclineReason",
    "billingMethod",
    "billingMethodCode",
    "masterPolIntID",
    "pacprcd2",
    "pocull",
    "businessType",
    "coInsurenceCode",
    "historicalReference",
    "pocupr",
    "provinceID",
    "reInsurenceCode",
    "sisBrokerCode",
    "sisInsuredCode",
    "transactionCode",
    "commUser",
    "departmentCode",
    "departmentID",
    "exclusiveFlagID",
    "programmeType",
    "freedomofServicesFlag",
    "coverage",
    "underwriterArea",
    "ofacCheckDate",
    "meridianRenewalDate",
    "endorsementIndicator",
    "ddMandateNumber",
    "bankAccountNumber",
    "nextPremiumDate",
    "nextPremiumAmount",
    "insurancePremiumTaxAmount",
    "currencyCode",
    "renewalFrequency",
    "gennexTpolicy",
    "benefitMultiplier",
    "accountHandlerID",
    "aceShare",
    "backendID",
    "backendID2",
    "complaintDate",
    "complaintReference",
    "entityShortName",
    "flagValue",
    "isComplaint",
    "isMigrated",
    "lineOfBusinessGroupCode",
    "lineOfBusinessID",
    "nationalAssociationofInsuranceCommissionersTypeID",
    "paymentStatusID",
    "policyCountryCode",
    "policyHolder",
    "policyID",
    "policyShare",
    "preventSendtoBackend",
    "productChange",
    "renewalType",
    "totalAceSharePremium",
    "vnab",
    "directAssumed",
    "distributionChannel",
    "premiumType",
    "renewalBusFlag",
    "gennextLockID",
    "tacitlyRenewedIndicator",
    "leader",
    "ratingSourceID",
    "boundBenchMark",
    "rateChange",
    "expaceShare",
    "contributionFactor",
    "majorLineID",
    "antiMoneyLaunderingBranch",
    "antiMoneyLaunderingBranchRisk",
    "antiMoneyLaunderingPMRisk",
    "nationalAssociationofInsuranceCommissionersCode",
    "antiMoneyLaunderingPM",
    "policyPremiumAmount",
    "sanctionCheck",
    "nationalAssociationofInsuranceCommissionersDescription",
    "portfolioClass",
    "nationalAssociationofInsuranceCommissionersExtension",
    "companyCode",
    "countryCode",
    "lineofBusiness",
    "marketingCode",
    "operationCode",
    "emissionDate",
    "agencyorZoneCode",
    "liqDifCode",
    "insuredNumber",
    "policyHolderNumber",
    "adjustmentCode",
    "indexUpdate",
    "refreshRate",
    "bonusBalance",
    "recoveryofExpensesorShares",
    "pilotCompanyCode",
    "policyNumberPilotCompany",
    "reinsurerCompanyCode",
    "operationCodeWithoutReserve",
    "collecting",
    "debtCollectorCode",
    "paymentConditionCode",
    "emissionChange",
    "provinceCode",
    "capitalInsuredorOwnParty",
    "financing",
    "organizerCode",
    "producerCode",
    "salesPlanCode",
    "percentageVariationSubstringers",
    "premiumModificationCode",
    "administrativeStringers",
    "issuingRights",
    "amountSocialService",
    "amountSuperBankingRate",
    "internalAmountOwnParty",
    "sealed",
    "originalBonus",
    "originalPrizeExternalCurrency",
    "originalPrizeUSD",
    "balanceExternalCurrency",
    "balanceUSD",
    "premiumGYH",
    "balanceCollectionExternalCurrency",
    "balanceCollectionUSD",
    "totalCommissionAmount",
    "totalDifferentialCommission",
    "balanceCommissionAmount",
    "balanceDifferentialCommission",
    "percentageAquisitionsExpenses",
    "referencePolicy",
    "referenceEndorsement",
    "itemQuantity",
    "cancelledOperation",
    "lastInstallmentDate",
    "reasonForMovement",
    "frequencyRebilling",
    "morABase",
    "documentPerCurrency",
    "docum",
    "taxPosition",
    "agentCollection1",
    "commissionorCollection1",
    "commissionorCollection1Code",
    "agentCollection2",
    "commissionorCollection2",
    "commissionorCollection2Code",
    "taxTotal",
    "percentageCommission",
    "camp02",
    "percentageEarthquakeCommission",
    "policyType",
    "periodicity",
    "typeofInsurance",
    "typeofBusiness",
    "yearorMonth",
    "typeofAssurance",
    "indemnityPeriod",
    "businessInterruption",
    "accommodationPolicy",
    "accountingIndicatorPremiumPaid",
    "beneficiaryNit",
    "percentagePortionLeader",
    "percentageCoInsuranceCeded",
    "coverageExtention",
    "coInsuranceCeded",
    "lobReference",
    "policyReference",
    "percentageBusinessInterruption",
    "additionalExpenses",
    "startingReleaseDate",
    "finishingReleaseDate",
    "grossTaxes",
    "civilEngineeringTerm",
    "typeofAssembly",
    "agencyBillingSerialNumber",
    "billingConsecutiveNumber",
    "renovationNumber",
    "policyMarkOLE",
    "typeofMaintenance",
    "maintenanceStartingDate",
    "maintenanceFinishingDate",
    "maintenanceTerms",
    "startingTestDate",
    "finishingTestDate",
    "testTerm",
    "startingProdDate",
    "finishingProdDate",
    "prodTerm",
    "brokerOperationNumber",
    "appendixRelated",
    "multinationalCode",
    "balanceIvaValue",
    "balanceExpressValue",
    "balancePremium",
    "businessSize",
    "updateDatabase",
    "interfMarkI",
    "user",
    "quoteNumber",
    "endrc",
    "fieldOfficeID",
    "policyStartDate",
    "policyEndDate",
    "insuredCode",
    "brokerID",
    "policyQuoteNumber",
    "underwriterAreaShortname",
    "brokerReference",
    "pacprCode",
    "segmentCode",
    "branchCode",
    "businessProcessingUnitCode",
    "contactID",
    "directAssumedCode",
    "distributionChannelCode",
    "exclusiveFlagCode",
    "fieldOfficeCode",
    "freedomofServicesFlagCode",
    "insuranceCompanyCode",
    "insuredID",
    "paymentTypeCode",
    "policyPeriod",
    "policyStateID",
    "prefixID",
    "prefixMid",
    "productID",
    "programmeTypeCode",
    "stateID",
    "underwriterID"
})
public class PolicyInfo {

    @XmlElementRef(name = "PolicyCoverRequest", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<PolicyCoverRequest> policyCoverRequest;
    @XmlElementRef(name = "PolicyNumber", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "PolicySite", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policySite;
    @XmlElementRef(name = "EntityCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityCode;
    @XmlElementRef(name = "MasterPolicyNumber", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterPolicyNumber;
    @XmlElement(name = "SecurityPolicyID")
    protected Integer securityPolicyID;
    @XmlElement(name = "PolicyTypeID")
    protected Integer policyTypeID;
    @XmlElement(name = "IsSensitive")
    protected Integer isSensitive;
    @XmlElement(name = "PrimaryLimit")
    protected BigDecimal primaryLimit;
    @XmlElement(name = "PrimaryInsurer")
    protected Integer primaryInsurer;
    @XmlElement(name = "CommissionPercentEL")
    protected BigDecimal commissionPercentEL;
    @XmlElement(name = "CommissionPercentOther")
    protected BigDecimal commissionPercentOther;
    @XmlElement(name = "WrittenLine")
    protected BigDecimal writtenLine;
    @XmlElement(name = "SignedLine")
    protected BigDecimal signedLine;
    @XmlElement(name = "InceptionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inceptionDate;
    @XmlElementRef(name = "RiskReferenceNo", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskReferenceNo;
    @XmlElement(name = "CountryofRiskID")
    protected Integer countryofRiskID;
    @XmlElementRef(name = "BusinessDescription", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessDescription;
    @XmlElement(name = "SegmentID")
    protected Integer segmentID;
    @XmlElement(name = "ProcessedBy")
    protected Integer processedBy;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElementRef(name = "PolicyGUID", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyGUID;
    @XmlElementRef(name = "ProductCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCode;
    @XmlElementRef(name = "SalesPersonID", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesPersonID;
    @XmlElementRef(name = "StandardIndustrialClassificationCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> standardIndustrialClassificationCode;
    @XmlElement(name = "StandardIndustrialClassificationID")
    protected Integer standardIndustrialClassificationID;
    @XmlElementRef(name = "PortfolioSubclass", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portfolioSubclass;
    @XmlElementRef(name = "InsuredName", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuredName;
    @XmlElement(name = "UWSRiskNumber")
    protected Integer uwsRiskNumber;
    @XmlElement(name = "UWSRiskVersion")
    protected Integer uwsRiskVersion;
    @XmlElementRef(name = "BackendLockedFlag", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backendLockedFlag;
    @XmlElement(name = "Syndicate")
    protected Integer syndicate;
    @XmlElement(name = "SignedOrder")
    protected BigDecimal signedOrder;
    @XmlElement(name = "TotalLine")
    protected BigDecimal totalLine;
    @XmlElement(name = "TotalExposure")
    protected BigDecimal totalExposure;
    @XmlElement(name = "QuotedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quotedDate;
    @XmlElement(name = "NotTakenupDeclineReason")
    protected Integer notTakenupDeclineReason;
    @XmlElement(name = "BillingMethod")
    protected Integer billingMethod;
    @XmlElementRef(name = "BillingMethodCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billingMethodCode;
    @XmlElement(name = "MasterPolIntID")
    protected Integer masterPolIntID;
    @XmlElementRef(name = "PACPR_CD_2", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pacprcd2;
    @XmlElementRef(name = "POCULL", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pocull;
    @XmlElement(name = "BusinessType")
    protected Integer businessType;
    @XmlElement(name = "CoInsurenceCode")
    protected Integer coInsurenceCode;
    @XmlElementRef(name = "HistoricalReference", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historicalReference;
    @XmlElementRef(name = "POCUPR", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pocupr;
    @XmlElement(name = "ProvinceID")
    protected Integer provinceID;
    @XmlElement(name = "ReInsurenceCode")
    protected Integer reInsurenceCode;
    @XmlElement(name = "SISBrokerCode")
    protected Integer sisBrokerCode;
    @XmlElement(name = "SISInsuredCode")
    protected Integer sisInsuredCode;
    @XmlElement(name = "TransactionCode")
    protected Integer transactionCode;
    @XmlElement(name = "CommUser")
    protected Integer commUser;
    @XmlElementRef(name = "DepartmentCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentCode;
    @XmlElement(name = "DepartmentID")
    protected Integer departmentID;
    @XmlElement(name = "ExclusiveFlagID")
    protected Integer exclusiveFlagID;
    @XmlElement(name = "ProgrammeType")
    protected Integer programmeType;
    @XmlElement(name = "FreedomofServicesFlag")
    protected Integer freedomofServicesFlag;
    @XmlElementRef(name = "Coverage", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coverage;
    @XmlElement(name = "UnderwriterArea")
    protected Integer underwriterArea;
    @XmlElement(name = "OFACCheckDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ofacCheckDate;
    @XmlElement(name = "MeridianRenewalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar meridianRenewalDate;
    @XmlElementRef(name = "EndorsementIndicator", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementIndicator;
    @XmlElementRef(name = "DDMandateNumber", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddMandateNumber;
    @XmlElementRef(name = "BankAccountNumber", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccountNumber;
    @XmlElement(name = "NextPremiumDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPremiumDate;
    @XmlElement(name = "NextPremiumAmount")
    protected BigDecimal nextPremiumAmount;
    @XmlElement(name = "InsurancePremiumTaxAmount")
    protected BigDecimal insurancePremiumTaxAmount;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "RenewalFrequency")
    protected Integer renewalFrequency;
    @XmlElementRef(name = "GENNEXTpolicy", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gennexTpolicy;
    @XmlElement(name = "BenefitMultiplier")
    protected BigDecimal benefitMultiplier;
    @XmlElement(name = "AccountHandlerID")
    protected Integer accountHandlerID;
    @XmlElement(name = "AceShare")
    protected BigDecimal aceShare;
    @XmlElement(name = "BackendID")
    protected Integer backendID;
    @XmlElement(name = "BackendID2")
    protected Integer backendID2;
    @XmlElement(name = "ComplaintDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar complaintDate;
    @XmlElementRef(name = "ComplaintReference", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complaintReference;
    @XmlElementRef(name = "EntityShortName", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityShortName;
    @XmlElementRef(name = "FlagValue", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagValue;
    @XmlElement(name = "IsComplaint")
    protected Integer isComplaint;
    @XmlElementRef(name = "Is_Migrated", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isMigrated;
    @XmlElement(name = "LineOfBusinessGroupCode")
    protected Integer lineOfBusinessGroupCode;
    @XmlElement(name = "LineOfBusinessID")
    protected Integer lineOfBusinessID;
    @XmlElement(name = "NationalAssociationofInsuranceCommissionersTypeID")
    protected Integer nationalAssociationofInsuranceCommissionersTypeID;
    @XmlElement(name = "PaymentStatusID")
    protected Integer paymentStatusID;
    @XmlElementRef(name = "PolicyCountryCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyCountryCode;
    @XmlElementRef(name = "PolicyHolder", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyHolder;
    @XmlElement(name = "PolicyID")
    protected Integer policyID;
    @XmlElementRef(name = "PolicyShare", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyShare;
    @XmlElement(name = "PreventSendtoBackend")
    protected Integer preventSendtoBackend;
    @XmlElement(name = "ProductChange")
    protected Integer productChange;
    @XmlElement(name = "RenewalType")
    protected Integer renewalType;
    @XmlElement(name = "TotalAceSharePremium")
    protected BigDecimal totalAceSharePremium;
    @XmlElementRef(name = "VNAB", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnab;
    @XmlElement(name = "DirectAssumed")
    protected Integer directAssumed;
    @XmlElement(name = "DistributionChannel")
    protected Integer distributionChannel;
    @XmlElement(name = "PremiumType")
    protected Integer premiumType;
    @XmlElementRef(name = "RenewalBusFlag", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> renewalBusFlag;
    @XmlElementRef(name = "GENNEXTLockID", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gennextLockID;
    @XmlElementRef(name = "TacitlyRenewedIndicator", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tacitlyRenewedIndicator;
    @XmlElementRef(name = "Leader", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leader;
    @XmlElement(name = "RatingSourceID")
    protected Integer ratingSourceID;
    @XmlElement(name = "BoundBenchMark")
    protected BigDecimal boundBenchMark;
    @XmlElement(name = "RateChange")
    protected BigDecimal rateChange;
    @XmlElement(name = "ExpaceShare")
    protected BigDecimal expaceShare;
    @XmlElement(name = "ContributionFactor")
    protected Integer contributionFactor;
    @XmlElement(name = "MajorLineID")
    protected Integer majorLineID;
    @XmlElementRef(name = "AntiMoneyLaunderingBranch", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antiMoneyLaunderingBranch;
    @XmlElement(name = "AntiMoneyLaunderingBranchRisk")
    protected Integer antiMoneyLaunderingBranchRisk;
    @XmlElement(name = "AntiMoneyLaunderingPMRisk")
    protected Integer antiMoneyLaunderingPMRisk;
    @XmlElement(name = "NationalAssociationofInsuranceCommissionersCode")
    protected Integer nationalAssociationofInsuranceCommissionersCode;
    @XmlElement(name = "AntiMoneyLaunderingPM")
    protected Integer antiMoneyLaunderingPM;
    @XmlElement(name = "PolicyPremiumAmount")
    protected BigDecimal policyPremiumAmount;
    @XmlElement(name = "SanctionCheck")
    protected Integer sanctionCheck;
    @XmlElement(name = "NationalAssociationofInsuranceCommissionersDescription")
    protected Integer nationalAssociationofInsuranceCommissionersDescription;
    @XmlElementRef(name = "PortfolioClass", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portfolioClass;
    @XmlElementRef(name = "NationalAssociationofInsuranceCommissionersExtension", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationalAssociationofInsuranceCommissionersExtension;
    @XmlElement(name = "CompanyCode")
    protected Integer companyCode;
    @XmlElementRef(name = "CountryCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElement(name = "LineofBusiness")
    protected Integer lineofBusiness;
    @XmlElement(name = "MarketingCode")
    protected Integer marketingCode;
    @XmlElement(name = "OperationCode")
    protected BigDecimal operationCode;
    @XmlElement(name = "EmissionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emissionDate;
    @XmlElement(name = "AgencyorZoneCode")
    protected BigDecimal agencyorZoneCode;
    @XmlElementRef(name = "LiqDifCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> liqDifCode;
    @XmlElement(name = "InsuredNumber")
    protected BigDecimal insuredNumber;
    @XmlElement(name = "PolicyHolderNumber")
    protected BigDecimal policyHolderNumber;
    @XmlElementRef(name = "AdjustmentCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustmentCode;
    @XmlElement(name = "IndexUpdate")
    protected BigDecimal indexUpdate;
    @XmlElementRef(name = "RefreshRate", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refreshRate;
    @XmlElement(name = "BonusBalance")
    protected BigDecimal bonusBalance;
    @XmlElement(name = "RecoveryofExpensesorShares")
    protected BigDecimal recoveryofExpensesorShares;
    @XmlElement(name = "PilotCompanyCode")
    protected BigDecimal pilotCompanyCode;
    @XmlElement(name = "PolicyNumberPilotCompany")
    protected BigDecimal policyNumberPilotCompany;
    @XmlElement(name = "ReinsurerCompanyCode")
    protected BigDecimal reinsurerCompanyCode;
    @XmlElement(name = "OperationCodeWithoutReserve")
    protected BigDecimal operationCodeWithoutReserve;
    @XmlElement(name = "Collecting")
    protected BigDecimal collecting;
    @XmlElement(name = "DebtCollectorCode")
    protected BigDecimal debtCollectorCode;
    @XmlElement(name = "PaymentConditionCode")
    protected BigDecimal paymentConditionCode;
    @XmlElement(name = "EmissionChange")
    protected BigDecimal emissionChange;
    @XmlElement(name = "ProvinceCode")
    protected BigDecimal provinceCode;
    @XmlElement(name = "CapitalInsuredorOwnParty")
    protected BigDecimal capitalInsuredorOwnParty;
    @XmlElement(name = "Financing")
    protected BigDecimal financing;
    @XmlElement(name = "OrganizerCode")
    protected BigDecimal organizerCode;
    @XmlElementRef(name = "ProducerCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> producerCode;
    @XmlElementRef(name = "SalesPlanCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesPlanCode;
    @XmlElement(name = "PercentageVariationSubstringers")
    protected BigDecimal percentageVariationSubstringers;
    @XmlElementRef(name = "PremiumModificationCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premiumModificationCode;
    @XmlElement(name = "AdministrativeStringers")
    protected BigDecimal administrativeStringers;
    @XmlElement(name = "IssuingRights")
    protected BigDecimal issuingRights;
    @XmlElement(name = "AmountSocialService")
    protected BigDecimal amountSocialService;
    @XmlElement(name = "AmountSuperBankingRate")
    protected BigDecimal amountSuperBankingRate;
    @XmlElement(name = "InternalAmountOwnParty")
    protected BigDecimal internalAmountOwnParty;
    @XmlElement(name = "Sealed")
    protected BigDecimal sealed;
    @XmlElement(name = "OriginalBonus")
    protected BigDecimal originalBonus;
    @XmlElement(name = "OriginalPrizeExternalCurrency")
    protected BigDecimal originalPrizeExternalCurrency;
    @XmlElement(name = "OriginalPrizeUSD")
    protected BigDecimal originalPrizeUSD;
    @XmlElement(name = "BalanceExternalCurrency")
    protected BigDecimal balanceExternalCurrency;
    @XmlElement(name = "BalanceUSD")
    protected BigDecimal balanceUSD;
    @XmlElement(name = "PremiumGYH")
    protected BigDecimal premiumGYH;
    @XmlElement(name = "BalanceCollectionExternalCurrency")
    protected BigDecimal balanceCollectionExternalCurrency;
    @XmlElement(name = "BalanceCollectionUSD")
    protected BigDecimal balanceCollectionUSD;
    @XmlElement(name = "TotalCommissionAmount")
    protected BigDecimal totalCommissionAmount;
    @XmlElement(name = "TotalDifferentialCommission")
    protected BigDecimal totalDifferentialCommission;
    @XmlElement(name = "BalanceCommissionAmount")
    protected BigDecimal balanceCommissionAmount;
    @XmlElement(name = "BalanceDifferentialCommission")
    protected BigDecimal balanceDifferentialCommission;
    @XmlElement(name = "PercentageAquisitionsExpenses")
    protected BigDecimal percentageAquisitionsExpenses;
    @XmlElement(name = "ReferencePolicy")
    protected BigDecimal referencePolicy;
    @XmlElement(name = "ReferenceEndorsement")
    protected Integer referenceEndorsement;
    @XmlElement(name = "ItemQuantity")
    protected BigDecimal itemQuantity;
    @XmlElementRef(name = "CancelledOperation", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cancelledOperation;
    @XmlElement(name = "LastInstallmentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastInstallmentDate;
    @XmlElementRef(name = "ReasonForMovement", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonForMovement;
    @XmlElementRef(name = "FrequencyRebilling", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequencyRebilling;
    @XmlElement(name = "MorABase")
    protected BigDecimal morABase;
    @XmlElementRef(name = "DocumentPerCurrency", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentPerCurrency;
    @XmlElementRef(name = "Docum", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docum;
    @XmlElementRef(name = "TaxPosition", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxPosition;
    @XmlElement(name = "AgentCollection1")
    protected BigDecimal agentCollection1;
    @XmlElement(name = "CommissionorCollection1")
    protected BigDecimal commissionorCollection1;
    @XmlElementRef(name = "CommissionorCollection1Code", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commissionorCollection1Code;
    @XmlElement(name = "AgentCollection2")
    protected BigDecimal agentCollection2;
    @XmlElement(name = "CommissionorCollection2")
    protected BigDecimal commissionorCollection2;
    @XmlElementRef(name = "CommissionorCollection2Code", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commissionorCollection2Code;
    @XmlElement(name = "TaxTotal")
    protected BigDecimal taxTotal;
    @XmlElement(name = "PercentageCommission")
    protected BigDecimal percentageCommission;
    @XmlElementRef(name = "Camp02", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> camp02;
    @XmlElement(name = "PercentageEarthquakeCommission")
    protected BigDecimal percentageEarthquakeCommission;
    @XmlElement(name = "PolicyType")
    protected Integer policyType;
    @XmlElement(name = "Periodicity")
    protected BigDecimal periodicity;
    @XmlElementRef(name = "TypeofInsurance", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeofInsurance;
    @XmlElement(name = "TypeofBusiness")
    protected Integer typeofBusiness;
    @XmlElement(name = "YearorMonth")
    protected BigDecimal yearorMonth;
    @XmlElementRef(name = "TypeofAssurance", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeofAssurance;
    @XmlElement(name = "IndemnityPeriod")
    protected BigDecimal indemnityPeriod;
    @XmlElementRef(name = "BusinessInterruption", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessInterruption;
    @XmlElement(name = "AccommodationPolicy")
    protected BigDecimal accommodationPolicy;
    @XmlElementRef(name = "AccountingIndicatorPremiumPaid", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountingIndicatorPremiumPaid;
    @XmlElement(name = "BeneficiaryNit")
    protected BigDecimal beneficiaryNit;
    @XmlElement(name = "PercentagePortionLeader")
    protected BigDecimal percentagePortionLeader;
    @XmlElement(name = "PercentageCoInsuranceCeded")
    protected BigDecimal percentageCoInsuranceCeded;
    @XmlElementRef(name = "CoverageExtention", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coverageExtention;
    @XmlElement(name = "CoInsuranceCeded")
    protected BigDecimal coInsuranceCeded;
    @XmlElement(name = "LOBReference")
    protected BigDecimal lobReference;
    @XmlElement(name = "PolicyReference")
    protected BigDecimal policyReference;
    @XmlElement(name = "PercentageBusinessInterruption")
    protected BigDecimal percentageBusinessInterruption;
    @XmlElement(name = "AdditionalExpenses")
    protected BigDecimal additionalExpenses;
    @XmlElement(name = "StartingReleaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startingReleaseDate;
    @XmlElement(name = "FinishingReleaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishingReleaseDate;
    @XmlElement(name = "GrossTaxes")
    protected BigDecimal grossTaxes;
    @XmlElement(name = "CivilEngineeringTerm")
    protected BigDecimal civilEngineeringTerm;
    @XmlElement(name = "TypeofAssembly")
    protected BigDecimal typeofAssembly;
    @XmlElement(name = "AgencyBillingSerialNumber")
    protected BigDecimal agencyBillingSerialNumber;
    @XmlElement(name = "BillingConsecutiveNumber")
    protected BigDecimal billingConsecutiveNumber;
    @XmlElement(name = "RenovationNumber")
    protected BigDecimal renovationNumber;
    @XmlElementRef(name = "PolicyMarkOLE", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyMarkOLE;
    @XmlElement(name = "TypeofMaintenance")
    protected BigDecimal typeofMaintenance;
    @XmlElement(name = "MaintenanceStartingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maintenanceStartingDate;
    @XmlElement(name = "MaintenanceFinishingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maintenanceFinishingDate;
    @XmlElement(name = "MaintenanceTerms")
    protected BigDecimal maintenanceTerms;
    @XmlElement(name = "StartingTestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startingTestDate;
    @XmlElement(name = "FinishingTestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishingTestDate;
    @XmlElement(name = "TestTerm")
    protected BigDecimal testTerm;
    @XmlElement(name = "StartingProdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startingProdDate;
    @XmlElement(name = "FinishingProdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishingProdDate;
    @XmlElement(name = "ProdTerm")
    protected BigDecimal prodTerm;
    @XmlElement(name = "BrokerOperationNumber")
    protected BigDecimal brokerOperationNumber;
    @XmlElement(name = "AppendixRelated")
    protected BigDecimal appendixRelated;
    @XmlElementRef(name = "MultinationalCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> multinationalCode;
    @XmlElement(name = "BalanceIvaValue")
    protected BigDecimal balanceIvaValue;
    @XmlElement(name = "BalanceExpressValue")
    protected BigDecimal balanceExpressValue;
    @XmlElement(name = "BalancePremium")
    protected BigDecimal balancePremium;
    @XmlElement(name = "BusinessSize")
    protected Integer businessSize;
    @XmlElementRef(name = "UpdateDatabase", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updateDatabase;
    @XmlElementRef(name = "InterfMark_I", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfMarkI;
    @XmlElementRef(name = "User", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> user;
    @XmlElementRef(name = "QuoteNumber", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteNumber;
    @XmlElementRef(name = "ENDRC", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endrc;
    @XmlElement(name = "FieldOfficeID")
    protected Integer fieldOfficeID;
    @XmlElement(name = "PolicyStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyStartDate;
    @XmlElement(name = "PolicyEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar policyEndDate;
    @XmlElementRef(name = "InsuredCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuredCode;
    @XmlElement(name = "BrokerID")
    protected Integer brokerID;
    @XmlElementRef(name = "PolicyQuoteNumber", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyQuoteNumber;
    @XmlElementRef(name = "UnderwriterAreaShortname", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> underwriterAreaShortname;
    @XmlElementRef(name = "BrokerReference", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brokerReference;
    @XmlElementRef(name = "PACPRCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pacprCode;
    @XmlElementRef(name = "SegmentCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segmentCode;
    @XmlElement(name = "BranchCode")
    protected Integer branchCode;
    @XmlElementRef(name = "BusinessProcessingUnitCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessProcessingUnitCode;
    @XmlElement(name = "ContactID")
    protected Integer contactID;
    @XmlElementRef(name = "DirectAssumedCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> directAssumedCode;
    @XmlElementRef(name = "DistributionChannelCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributionChannelCode;
    @XmlElementRef(name = "ExclusiveFlagCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exclusiveFlagCode;
    @XmlElementRef(name = "FieldOfficeCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldOfficeCode;
    @XmlElementRef(name = "FreedomofServicesFlagCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freedomofServicesFlagCode;
    @XmlElementRef(name = "InsuranceCompanyCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceCompanyCode;
    @XmlElement(name = "InsuredID")
    protected Integer insuredID;
    @XmlElementRef(name = "PaymentTypeCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentTypeCode;
    @XmlElementRef(name = "PolicyPeriod", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyPeriod;
    @XmlElementRef(name = "PolicyStateID", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyStateID;
    @XmlElement(name = "PrefixID")
    protected Integer prefixID;
    @XmlElementRef(name = "PrefixMid", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefixMid;
    @XmlElement(name = "ProductID")
    protected Integer productID;
    @XmlElementRef(name = "ProgrammeTypeCode", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> programmeTypeCode;
    @XmlElement(name = "StateID")
    protected Integer stateID;
    @XmlElement(name = "UnderwriterID")
    protected Integer underwriterID;

    /**
     * Gets the value of the policyCoverRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PolicyCoverRequest }{@code >}
     *     
     */
    public JAXBElement<PolicyCoverRequest> getPolicyCoverRequest() {
        return policyCoverRequest;
    }

    /**
     * Sets the value of the policyCoverRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PolicyCoverRequest }{@code >}
     *     
     */
    public void setPolicyCoverRequest(JAXBElement<PolicyCoverRequest> value) {
        this.policyCoverRequest = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyNumber(JAXBElement<String> value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the policySite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicySite() {
        return policySite;
    }

    /**
     * Sets the value of the policySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicySite(JAXBElement<String> value) {
        this.policySite = value;
    }

    /**
     * Gets the value of the entityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityCode() {
        return entityCode;
    }

    /**
     * Sets the value of the entityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityCode(JAXBElement<String> value) {
        this.entityCode = value;
    }

    /**
     * Gets the value of the masterPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterPolicyNumber() {
        return masterPolicyNumber;
    }

    /**
     * Sets the value of the masterPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterPolicyNumber(JAXBElement<String> value) {
        this.masterPolicyNumber = value;
    }

    /**
     * Gets the value of the securityPolicyID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecurityPolicyID() {
        return securityPolicyID;
    }

    /**
     * Sets the value of the securityPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecurityPolicyID(Integer value) {
        this.securityPolicyID = value;
    }

    /**
     * Gets the value of the policyTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyTypeID() {
        return policyTypeID;
    }

    /**
     * Sets the value of the policyTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyTypeID(Integer value) {
        this.policyTypeID = value;
    }

    /**
     * Gets the value of the isSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsSensitive() {
        return isSensitive;
    }

    /**
     * Sets the value of the isSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsSensitive(Integer value) {
        this.isSensitive = value;
    }

    /**
     * Gets the value of the primaryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaryLimit() {
        return primaryLimit;
    }

    /**
     * Sets the value of the primaryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaryLimit(BigDecimal value) {
        this.primaryLimit = value;
    }

    /**
     * Gets the value of the primaryInsurer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaryInsurer() {
        return primaryInsurer;
    }

    /**
     * Sets the value of the primaryInsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaryInsurer(Integer value) {
        this.primaryInsurer = value;
    }

    /**
     * Gets the value of the commissionPercentEL property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionPercentEL() {
        return commissionPercentEL;
    }

    /**
     * Sets the value of the commissionPercentEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionPercentEL(BigDecimal value) {
        this.commissionPercentEL = value;
    }

    /**
     * Gets the value of the commissionPercentOther property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionPercentOther() {
        return commissionPercentOther;
    }

    /**
     * Sets the value of the commissionPercentOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionPercentOther(BigDecimal value) {
        this.commissionPercentOther = value;
    }

    /**
     * Gets the value of the writtenLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWrittenLine() {
        return writtenLine;
    }

    /**
     * Sets the value of the writtenLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWrittenLine(BigDecimal value) {
        this.writtenLine = value;
    }

    /**
     * Gets the value of the signedLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignedLine() {
        return signedLine;
    }

    /**
     * Sets the value of the signedLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignedLine(BigDecimal value) {
        this.signedLine = value;
    }

    /**
     * Gets the value of the inceptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInceptionDate() {
        return inceptionDate;
    }

    /**
     * Sets the value of the inceptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInceptionDate(XMLGregorianCalendar value) {
        this.inceptionDate = value;
    }

    /**
     * Gets the value of the riskReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskReferenceNo() {
        return riskReferenceNo;
    }

    /**
     * Sets the value of the riskReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskReferenceNo(JAXBElement<String> value) {
        this.riskReferenceNo = value;
    }

    /**
     * Gets the value of the countryofRiskID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryofRiskID() {
        return countryofRiskID;
    }

    /**
     * Sets the value of the countryofRiskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryofRiskID(Integer value) {
        this.countryofRiskID = value;
    }

    /**
     * Gets the value of the businessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessDescription() {
        return businessDescription;
    }

    /**
     * Sets the value of the businessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessDescription(JAXBElement<String> value) {
        this.businessDescription = value;
    }

    /**
     * Gets the value of the segmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentID() {
        return segmentID;
    }

    /**
     * Sets the value of the segmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentID(Integer value) {
        this.segmentID = value;
    }

    /**
     * Gets the value of the processedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessedBy() {
        return processedBy;
    }

    /**
     * Sets the value of the processedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessedBy(Integer value) {
        this.processedBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the policyGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyGUID() {
        return policyGUID;
    }

    /**
     * Sets the value of the policyGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyGUID(JAXBElement<String> value) {
        this.policyGUID = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCode(JAXBElement<String> value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the salesPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesPersonID() {
        return salesPersonID;
    }

    /**
     * Sets the value of the salesPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesPersonID(JAXBElement<String> value) {
        this.salesPersonID = value;
    }

    /**
     * Gets the value of the standardIndustrialClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStandardIndustrialClassificationCode() {
        return standardIndustrialClassificationCode;
    }

    /**
     * Sets the value of the standardIndustrialClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStandardIndustrialClassificationCode(JAXBElement<String> value) {
        this.standardIndustrialClassificationCode = value;
    }

    /**
     * Gets the value of the standardIndustrialClassificationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStandardIndustrialClassificationID() {
        return standardIndustrialClassificationID;
    }

    /**
     * Sets the value of the standardIndustrialClassificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStandardIndustrialClassificationID(Integer value) {
        this.standardIndustrialClassificationID = value;
    }

    /**
     * Gets the value of the portfolioSubclass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortfolioSubclass() {
        return portfolioSubclass;
    }

    /**
     * Sets the value of the portfolioSubclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortfolioSubclass(JAXBElement<String> value) {
        this.portfolioSubclass = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredName(JAXBElement<String> value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the uwsRiskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUWSRiskNumber() {
        return uwsRiskNumber;
    }

    /**
     * Sets the value of the uwsRiskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUWSRiskNumber(Integer value) {
        this.uwsRiskNumber = value;
    }

    /**
     * Gets the value of the uwsRiskVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUWSRiskVersion() {
        return uwsRiskVersion;
    }

    /**
     * Sets the value of the uwsRiskVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUWSRiskVersion(Integer value) {
        this.uwsRiskVersion = value;
    }

    /**
     * Gets the value of the backendLockedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackendLockedFlag() {
        return backendLockedFlag;
    }

    /**
     * Sets the value of the backendLockedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackendLockedFlag(JAXBElement<String> value) {
        this.backendLockedFlag = value;
    }

    /**
     * Gets the value of the syndicate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSyndicate() {
        return syndicate;
    }

    /**
     * Sets the value of the syndicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSyndicate(Integer value) {
        this.syndicate = value;
    }

    /**
     * Gets the value of the signedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignedOrder() {
        return signedOrder;
    }

    /**
     * Sets the value of the signedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignedOrder(BigDecimal value) {
        this.signedOrder = value;
    }

    /**
     * Gets the value of the totalLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLine() {
        return totalLine;
    }

    /**
     * Sets the value of the totalLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLine(BigDecimal value) {
        this.totalLine = value;
    }

    /**
     * Gets the value of the totalExposure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExposure() {
        return totalExposure;
    }

    /**
     * Sets the value of the totalExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExposure(BigDecimal value) {
        this.totalExposure = value;
    }

    /**
     * Gets the value of the quotedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuotedDate() {
        return quotedDate;
    }

    /**
     * Sets the value of the quotedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuotedDate(XMLGregorianCalendar value) {
        this.quotedDate = value;
    }

    /**
     * Gets the value of the notTakenupDeclineReason property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotTakenupDeclineReason() {
        return notTakenupDeclineReason;
    }

    /**
     * Sets the value of the notTakenupDeclineReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotTakenupDeclineReason(Integer value) {
        this.notTakenupDeclineReason = value;
    }

    /**
     * Gets the value of the billingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingMethod() {
        return billingMethod;
    }

    /**
     * Sets the value of the billingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingMethod(Integer value) {
        this.billingMethod = value;
    }

    /**
     * Gets the value of the billingMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingMethodCode() {
        return billingMethodCode;
    }

    /**
     * Sets the value of the billingMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingMethodCode(JAXBElement<String> value) {
        this.billingMethodCode = value;
    }

    /**
     * Gets the value of the masterPolIntID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasterPolIntID() {
        return masterPolIntID;
    }

    /**
     * Sets the value of the masterPolIntID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasterPolIntID(Integer value) {
        this.masterPolIntID = value;
    }

    /**
     * Gets the value of the pacprcd2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPACPRCD2() {
        return pacprcd2;
    }

    /**
     * Sets the value of the pacprcd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPACPRCD2(JAXBElement<String> value) {
        this.pacprcd2 = value;
    }

    /**
     * Gets the value of the pocull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOCULL() {
        return pocull;
    }

    /**
     * Sets the value of the pocull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOCULL(JAXBElement<String> value) {
        this.pocull = value;
    }

    /**
     * Gets the value of the businessType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * Sets the value of the businessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessType(Integer value) {
        this.businessType = value;
    }

    /**
     * Gets the value of the coInsurenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoInsurenceCode() {
        return coInsurenceCode;
    }

    /**
     * Sets the value of the coInsurenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoInsurenceCode(Integer value) {
        this.coInsurenceCode = value;
    }

    /**
     * Gets the value of the historicalReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoricalReference() {
        return historicalReference;
    }

    /**
     * Sets the value of the historicalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoricalReference(JAXBElement<String> value) {
        this.historicalReference = value;
    }

    /**
     * Gets the value of the pocupr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOCUPR() {
        return pocupr;
    }

    /**
     * Sets the value of the pocupr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOCUPR(JAXBElement<String> value) {
        this.pocupr = value;
    }

    /**
     * Gets the value of the provinceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProvinceID() {
        return provinceID;
    }

    /**
     * Sets the value of the provinceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProvinceID(Integer value) {
        this.provinceID = value;
    }

    /**
     * Gets the value of the reInsurenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReInsurenceCode() {
        return reInsurenceCode;
    }

    /**
     * Sets the value of the reInsurenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReInsurenceCode(Integer value) {
        this.reInsurenceCode = value;
    }

    /**
     * Gets the value of the sisBrokerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSISBrokerCode() {
        return sisBrokerCode;
    }

    /**
     * Sets the value of the sisBrokerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSISBrokerCode(Integer value) {
        this.sisBrokerCode = value;
    }

    /**
     * Gets the value of the sisInsuredCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSISInsuredCode() {
        return sisInsuredCode;
    }

    /**
     * Sets the value of the sisInsuredCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSISInsuredCode(Integer value) {
        this.sisInsuredCode = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionCode(Integer value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the commUser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommUser() {
        return commUser;
    }

    /**
     * Sets the value of the commUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommUser(Integer value) {
        this.commUser = value;
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentCode(JAXBElement<String> value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartmentID(Integer value) {
        this.departmentID = value;
    }

    /**
     * Gets the value of the exclusiveFlagID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExclusiveFlagID() {
        return exclusiveFlagID;
    }

    /**
     * Sets the value of the exclusiveFlagID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExclusiveFlagID(Integer value) {
        this.exclusiveFlagID = value;
    }

    /**
     * Gets the value of the programmeType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgrammeType() {
        return programmeType;
    }

    /**
     * Sets the value of the programmeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgrammeType(Integer value) {
        this.programmeType = value;
    }

    /**
     * Gets the value of the freedomofServicesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreedomofServicesFlag() {
        return freedomofServicesFlag;
    }

    /**
     * Sets the value of the freedomofServicesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreedomofServicesFlag(Integer value) {
        this.freedomofServicesFlag = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoverage(JAXBElement<String> value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the underwriterArea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnderwriterArea() {
        return underwriterArea;
    }

    /**
     * Sets the value of the underwriterArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnderwriterArea(Integer value) {
        this.underwriterArea = value;
    }

    /**
     * Gets the value of the ofacCheckDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOFACCheckDate() {
        return ofacCheckDate;
    }

    /**
     * Sets the value of the ofacCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOFACCheckDate(XMLGregorianCalendar value) {
        this.ofacCheckDate = value;
    }

    /**
     * Gets the value of the meridianRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeridianRenewalDate() {
        return meridianRenewalDate;
    }

    /**
     * Sets the value of the meridianRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeridianRenewalDate(XMLGregorianCalendar value) {
        this.meridianRenewalDate = value;
    }

    /**
     * Gets the value of the endorsementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsementIndicator() {
        return endorsementIndicator;
    }

    /**
     * Sets the value of the endorsementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsementIndicator(JAXBElement<String> value) {
        this.endorsementIndicator = value;
    }

    /**
     * Gets the value of the ddMandateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDDMandateNumber() {
        return ddMandateNumber;
    }

    /**
     * Sets the value of the ddMandateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDDMandateNumber(JAXBElement<String> value) {
        this.ddMandateNumber = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccountNumber(JAXBElement<String> value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the nextPremiumDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPremiumDate() {
        return nextPremiumDate;
    }

    /**
     * Sets the value of the nextPremiumDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPremiumDate(XMLGregorianCalendar value) {
        this.nextPremiumDate = value;
    }

    /**
     * Gets the value of the nextPremiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNextPremiumAmount() {
        return nextPremiumAmount;
    }

    /**
     * Sets the value of the nextPremiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNextPremiumAmount(BigDecimal value) {
        this.nextPremiumAmount = value;
    }

    /**
     * Gets the value of the insurancePremiumTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsurancePremiumTaxAmount() {
        return insurancePremiumTaxAmount;
    }

    /**
     * Sets the value of the insurancePremiumTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsurancePremiumTaxAmount(BigDecimal value) {
        this.insurancePremiumTaxAmount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the renewalFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRenewalFrequency() {
        return renewalFrequency;
    }

    /**
     * Sets the value of the renewalFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRenewalFrequency(Integer value) {
        this.renewalFrequency = value;
    }

    /**
     * Gets the value of the gennexTpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGENNEXTpolicy() {
        return gennexTpolicy;
    }

    /**
     * Sets the value of the gennexTpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGENNEXTpolicy(JAXBElement<String> value) {
        this.gennexTpolicy = value;
    }

    /**
     * Gets the value of the benefitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenefitMultiplier() {
        return benefitMultiplier;
    }

    /**
     * Sets the value of the benefitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenefitMultiplier(BigDecimal value) {
        this.benefitMultiplier = value;
    }

    /**
     * Gets the value of the accountHandlerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountHandlerID() {
        return accountHandlerID;
    }

    /**
     * Sets the value of the accountHandlerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountHandlerID(Integer value) {
        this.accountHandlerID = value;
    }

    /**
     * Gets the value of the aceShare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAceShare() {
        return aceShare;
    }

    /**
     * Sets the value of the aceShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAceShare(BigDecimal value) {
        this.aceShare = value;
    }

    /**
     * Gets the value of the backendID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackendID() {
        return backendID;
    }

    /**
     * Sets the value of the backendID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackendID(Integer value) {
        this.backendID = value;
    }

    /**
     * Gets the value of the backendID2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackendID2() {
        return backendID2;
    }

    /**
     * Sets the value of the backendID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackendID2(Integer value) {
        this.backendID2 = value;
    }

    /**
     * Gets the value of the complaintDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getComplaintDate() {
        return complaintDate;
    }

    /**
     * Sets the value of the complaintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setComplaintDate(XMLGregorianCalendar value) {
        this.complaintDate = value;
    }

    /**
     * Gets the value of the complaintReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplaintReference() {
        return complaintReference;
    }

    /**
     * Sets the value of the complaintReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplaintReference(JAXBElement<String> value) {
        this.complaintReference = value;
    }

    /**
     * Gets the value of the entityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityShortName() {
        return entityShortName;
    }

    /**
     * Sets the value of the entityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityShortName(JAXBElement<String> value) {
        this.entityShortName = value;
    }

    /**
     * Gets the value of the flagValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagValue() {
        return flagValue;
    }

    /**
     * Sets the value of the flagValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagValue(JAXBElement<String> value) {
        this.flagValue = value;
    }

    /**
     * Gets the value of the isComplaint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsComplaint() {
        return isComplaint;
    }

    /**
     * Sets the value of the isComplaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsComplaint(Integer value) {
        this.isComplaint = value;
    }

    /**
     * Gets the value of the isMigrated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsMigrated() {
        return isMigrated;
    }

    /**
     * Sets the value of the isMigrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsMigrated(JAXBElement<String> value) {
        this.isMigrated = value;
    }

    /**
     * Gets the value of the lineOfBusinessGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineOfBusinessGroupCode() {
        return lineOfBusinessGroupCode;
    }

    /**
     * Sets the value of the lineOfBusinessGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineOfBusinessGroupCode(Integer value) {
        this.lineOfBusinessGroupCode = value;
    }

    /**
     * Gets the value of the lineOfBusinessID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineOfBusinessID() {
        return lineOfBusinessID;
    }

    /**
     * Sets the value of the lineOfBusinessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineOfBusinessID(Integer value) {
        this.lineOfBusinessID = value;
    }

    /**
     * Gets the value of the nationalAssociationofInsuranceCommissionersTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNationalAssociationofInsuranceCommissionersTypeID() {
        return nationalAssociationofInsuranceCommissionersTypeID;
    }

    /**
     * Sets the value of the nationalAssociationofInsuranceCommissionersTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNationalAssociationofInsuranceCommissionersTypeID(Integer value) {
        this.nationalAssociationofInsuranceCommissionersTypeID = value;
    }

    /**
     * Gets the value of the paymentStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentStatusID() {
        return paymentStatusID;
    }

    /**
     * Sets the value of the paymentStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentStatusID(Integer value) {
        this.paymentStatusID = value;
    }

    /**
     * Gets the value of the policyCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyCountryCode() {
        return policyCountryCode;
    }

    /**
     * Sets the value of the policyCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyCountryCode(JAXBElement<String> value) {
        this.policyCountryCode = value;
    }

    /**
     * Gets the value of the policyHolder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyHolder() {
        return policyHolder;
    }

    /**
     * Sets the value of the policyHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyHolder(JAXBElement<String> value) {
        this.policyHolder = value;
    }

    /**
     * Gets the value of the policyID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyID() {
        return policyID;
    }

    /**
     * Sets the value of the policyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyID(Integer value) {
        this.policyID = value;
    }

    /**
     * Gets the value of the policyShare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyShare() {
        return policyShare;
    }

    /**
     * Sets the value of the policyShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyShare(JAXBElement<String> value) {
        this.policyShare = value;
    }

    /**
     * Gets the value of the preventSendtoBackend property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreventSendtoBackend() {
        return preventSendtoBackend;
    }

    /**
     * Sets the value of the preventSendtoBackend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreventSendtoBackend(Integer value) {
        this.preventSendtoBackend = value;
    }

    /**
     * Gets the value of the productChange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductChange() {
        return productChange;
    }

    /**
     * Sets the value of the productChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductChange(Integer value) {
        this.productChange = value;
    }

    /**
     * Gets the value of the renewalType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRenewalType() {
        return renewalType;
    }

    /**
     * Sets the value of the renewalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRenewalType(Integer value) {
        this.renewalType = value;
    }

    /**
     * Gets the value of the totalAceSharePremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAceSharePremium() {
        return totalAceSharePremium;
    }

    /**
     * Sets the value of the totalAceSharePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAceSharePremium(BigDecimal value) {
        this.totalAceSharePremium = value;
    }

    /**
     * Gets the value of the vnab property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNAB() {
        return vnab;
    }

    /**
     * Sets the value of the vnab property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNAB(JAXBElement<String> value) {
        this.vnab = value;
    }

    /**
     * Gets the value of the directAssumed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectAssumed() {
        return directAssumed;
    }

    /**
     * Sets the value of the directAssumed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectAssumed(Integer value) {
        this.directAssumed = value;
    }

    /**
     * Gets the value of the distributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * Sets the value of the distributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistributionChannel(Integer value) {
        this.distributionChannel = value;
    }

    /**
     * Gets the value of the premiumType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPremiumType() {
        return premiumType;
    }

    /**
     * Sets the value of the premiumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPremiumType(Integer value) {
        this.premiumType = value;
    }

    /**
     * Gets the value of the renewalBusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRenewalBusFlag() {
        return renewalBusFlag;
    }

    /**
     * Sets the value of the renewalBusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRenewalBusFlag(JAXBElement<String> value) {
        this.renewalBusFlag = value;
    }

    /**
     * Gets the value of the gennextLockID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGENNEXTLockID() {
        return gennextLockID;
    }

    /**
     * Sets the value of the gennextLockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGENNEXTLockID(JAXBElement<String> value) {
        this.gennextLockID = value;
    }

    /**
     * Gets the value of the tacitlyRenewedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTacitlyRenewedIndicator() {
        return tacitlyRenewedIndicator;
    }

    /**
     * Sets the value of the tacitlyRenewedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTacitlyRenewedIndicator(JAXBElement<String> value) {
        this.tacitlyRenewedIndicator = value;
    }

    /**
     * Gets the value of the leader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeader() {
        return leader;
    }

    /**
     * Sets the value of the leader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeader(JAXBElement<String> value) {
        this.leader = value;
    }

    /**
     * Gets the value of the ratingSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingSourceID() {
        return ratingSourceID;
    }

    /**
     * Sets the value of the ratingSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingSourceID(Integer value) {
        this.ratingSourceID = value;
    }

    /**
     * Gets the value of the boundBenchMark property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoundBenchMark() {
        return boundBenchMark;
    }

    /**
     * Sets the value of the boundBenchMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoundBenchMark(BigDecimal value) {
        this.boundBenchMark = value;
    }

    /**
     * Gets the value of the rateChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateChange() {
        return rateChange;
    }

    /**
     * Sets the value of the rateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateChange(BigDecimal value) {
        this.rateChange = value;
    }

    /**
     * Gets the value of the expaceShare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpaceShare() {
        return expaceShare;
    }

    /**
     * Sets the value of the expaceShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpaceShare(BigDecimal value) {
        this.expaceShare = value;
    }

    /**
     * Gets the value of the contributionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContributionFactor() {
        return contributionFactor;
    }

    /**
     * Sets the value of the contributionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContributionFactor(Integer value) {
        this.contributionFactor = value;
    }

    /**
     * Gets the value of the majorLineID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMajorLineID() {
        return majorLineID;
    }

    /**
     * Sets the value of the majorLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorLineID(Integer value) {
        this.majorLineID = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntiMoneyLaunderingBranch() {
        return antiMoneyLaunderingBranch;
    }

    /**
     * Sets the value of the antiMoneyLaunderingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntiMoneyLaunderingBranch(JAXBElement<String> value) {
        this.antiMoneyLaunderingBranch = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingBranchRisk property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMoneyLaunderingBranchRisk() {
        return antiMoneyLaunderingBranchRisk;
    }

    /**
     * Sets the value of the antiMoneyLaunderingBranchRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMoneyLaunderingBranchRisk(Integer value) {
        this.antiMoneyLaunderingBranchRisk = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingPMRisk property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMoneyLaunderingPMRisk() {
        return antiMoneyLaunderingPMRisk;
    }

    /**
     * Sets the value of the antiMoneyLaunderingPMRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMoneyLaunderingPMRisk(Integer value) {
        this.antiMoneyLaunderingPMRisk = value;
    }

    /**
     * Gets the value of the nationalAssociationofInsuranceCommissionersCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNationalAssociationofInsuranceCommissionersCode() {
        return nationalAssociationofInsuranceCommissionersCode;
    }

    /**
     * Sets the value of the nationalAssociationofInsuranceCommissionersCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNationalAssociationofInsuranceCommissionersCode(Integer value) {
        this.nationalAssociationofInsuranceCommissionersCode = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingPM property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMoneyLaunderingPM() {
        return antiMoneyLaunderingPM;
    }

    /**
     * Sets the value of the antiMoneyLaunderingPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMoneyLaunderingPM(Integer value) {
        this.antiMoneyLaunderingPM = value;
    }

    /**
     * Gets the value of the policyPremiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyPremiumAmount() {
        return policyPremiumAmount;
    }

    /**
     * Sets the value of the policyPremiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyPremiumAmount(BigDecimal value) {
        this.policyPremiumAmount = value;
    }

    /**
     * Gets the value of the sanctionCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSanctionCheck() {
        return sanctionCheck;
    }

    /**
     * Sets the value of the sanctionCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSanctionCheck(Integer value) {
        this.sanctionCheck = value;
    }

    /**
     * Gets the value of the nationalAssociationofInsuranceCommissionersDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNationalAssociationofInsuranceCommissionersDescription() {
        return nationalAssociationofInsuranceCommissionersDescription;
    }

    /**
     * Sets the value of the nationalAssociationofInsuranceCommissionersDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNationalAssociationofInsuranceCommissionersDescription(Integer value) {
        this.nationalAssociationofInsuranceCommissionersDescription = value;
    }

    /**
     * Gets the value of the portfolioClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortfolioClass() {
        return portfolioClass;
    }

    /**
     * Sets the value of the portfolioClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortfolioClass(JAXBElement<String> value) {
        this.portfolioClass = value;
    }

    /**
     * Gets the value of the nationalAssociationofInsuranceCommissionersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalAssociationofInsuranceCommissionersExtension() {
        return nationalAssociationofInsuranceCommissionersExtension;
    }

    /**
     * Sets the value of the nationalAssociationofInsuranceCommissionersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalAssociationofInsuranceCommissionersExtension(JAXBElement<String> value) {
        this.nationalAssociationofInsuranceCommissionersExtension = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyCode(Integer value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the lineofBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineofBusiness() {
        return lineofBusiness;
    }

    /**
     * Sets the value of the lineofBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineofBusiness(Integer value) {
        this.lineofBusiness = value;
    }

    /**
     * Gets the value of the marketingCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarketingCode() {
        return marketingCode;
    }

    /**
     * Sets the value of the marketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarketingCode(Integer value) {
        this.marketingCode = value;
    }

    /**
     * Gets the value of the operationCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the value of the operationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperationCode(BigDecimal value) {
        this.operationCode = value;
    }

    /**
     * Gets the value of the emissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmissionDate() {
        return emissionDate;
    }

    /**
     * Sets the value of the emissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmissionDate(XMLGregorianCalendar value) {
        this.emissionDate = value;
    }

    /**
     * Gets the value of the agencyorZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgencyorZoneCode() {
        return agencyorZoneCode;
    }

    /**
     * Sets the value of the agencyorZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgencyorZoneCode(BigDecimal value) {
        this.agencyorZoneCode = value;
    }

    /**
     * Gets the value of the liqDifCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLiqDifCode() {
        return liqDifCode;
    }

    /**
     * Sets the value of the liqDifCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLiqDifCode(JAXBElement<String> value) {
        this.liqDifCode = value;
    }

    /**
     * Gets the value of the insuredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredNumber() {
        return insuredNumber;
    }

    /**
     * Sets the value of the insuredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredNumber(BigDecimal value) {
        this.insuredNumber = value;
    }

    /**
     * Gets the value of the policyHolderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyHolderNumber() {
        return policyHolderNumber;
    }

    /**
     * Sets the value of the policyHolderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyHolderNumber(BigDecimal value) {
        this.policyHolderNumber = value;
    }

    /**
     * Gets the value of the adjustmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustmentCode() {
        return adjustmentCode;
    }

    /**
     * Sets the value of the adjustmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustmentCode(JAXBElement<String> value) {
        this.adjustmentCode = value;
    }

    /**
     * Gets the value of the indexUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexUpdate() {
        return indexUpdate;
    }

    /**
     * Sets the value of the indexUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexUpdate(BigDecimal value) {
        this.indexUpdate = value;
    }

    /**
     * Gets the value of the refreshRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefreshRate() {
        return refreshRate;
    }

    /**
     * Sets the value of the refreshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefreshRate(JAXBElement<String> value) {
        this.refreshRate = value;
    }

    /**
     * Gets the value of the bonusBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonusBalance() {
        return bonusBalance;
    }

    /**
     * Sets the value of the bonusBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonusBalance(BigDecimal value) {
        this.bonusBalance = value;
    }

    /**
     * Gets the value of the recoveryofExpensesorShares property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecoveryofExpensesorShares() {
        return recoveryofExpensesorShares;
    }

    /**
     * Sets the value of the recoveryofExpensesorShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecoveryofExpensesorShares(BigDecimal value) {
        this.recoveryofExpensesorShares = value;
    }

    /**
     * Gets the value of the pilotCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPilotCompanyCode() {
        return pilotCompanyCode;
    }

    /**
     * Sets the value of the pilotCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPilotCompanyCode(BigDecimal value) {
        this.pilotCompanyCode = value;
    }

    /**
     * Gets the value of the policyNumberPilotCompany property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyNumberPilotCompany() {
        return policyNumberPilotCompany;
    }

    /**
     * Sets the value of the policyNumberPilotCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyNumberPilotCompany(BigDecimal value) {
        this.policyNumberPilotCompany = value;
    }

    /**
     * Gets the value of the reinsurerCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReinsurerCompanyCode() {
        return reinsurerCompanyCode;
    }

    /**
     * Sets the value of the reinsurerCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReinsurerCompanyCode(BigDecimal value) {
        this.reinsurerCompanyCode = value;
    }

    /**
     * Gets the value of the operationCodeWithoutReserve property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperationCodeWithoutReserve() {
        return operationCodeWithoutReserve;
    }

    /**
     * Sets the value of the operationCodeWithoutReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperationCodeWithoutReserve(BigDecimal value) {
        this.operationCodeWithoutReserve = value;
    }

    /**
     * Gets the value of the collecting property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollecting() {
        return collecting;
    }

    /**
     * Sets the value of the collecting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollecting(BigDecimal value) {
        this.collecting = value;
    }

    /**
     * Gets the value of the debtCollectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtCollectorCode() {
        return debtCollectorCode;
    }

    /**
     * Sets the value of the debtCollectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtCollectorCode(BigDecimal value) {
        this.debtCollectorCode = value;
    }

    /**
     * Gets the value of the paymentConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentConditionCode() {
        return paymentConditionCode;
    }

    /**
     * Sets the value of the paymentConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentConditionCode(BigDecimal value) {
        this.paymentConditionCode = value;
    }

    /**
     * Gets the value of the emissionChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmissionChange() {
        return emissionChange;
    }

    /**
     * Sets the value of the emissionChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmissionChange(BigDecimal value) {
        this.emissionChange = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProvinceCode(BigDecimal value) {
        this.provinceCode = value;
    }

    /**
     * Gets the value of the capitalInsuredorOwnParty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalInsuredorOwnParty() {
        return capitalInsuredorOwnParty;
    }

    /**
     * Sets the value of the capitalInsuredorOwnParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalInsuredorOwnParty(BigDecimal value) {
        this.capitalInsuredorOwnParty = value;
    }

    /**
     * Gets the value of the financing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinancing(BigDecimal value) {
        this.financing = value;
    }

    /**
     * Gets the value of the organizerCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrganizerCode() {
        return organizerCode;
    }

    /**
     * Sets the value of the organizerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrganizerCode(BigDecimal value) {
        this.organizerCode = value;
    }

    /**
     * Gets the value of the producerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProducerCode(JAXBElement<String> value) {
        this.producerCode = value;
    }

    /**
     * Gets the value of the salesPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesPlanCode() {
        return salesPlanCode;
    }

    /**
     * Sets the value of the salesPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesPlanCode(JAXBElement<String> value) {
        this.salesPlanCode = value;
    }

    /**
     * Gets the value of the percentageVariationSubstringers property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageVariationSubstringers() {
        return percentageVariationSubstringers;
    }

    /**
     * Sets the value of the percentageVariationSubstringers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageVariationSubstringers(BigDecimal value) {
        this.percentageVariationSubstringers = value;
    }

    /**
     * Gets the value of the premiumModificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremiumModificationCode() {
        return premiumModificationCode;
    }

    /**
     * Sets the value of the premiumModificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremiumModificationCode(JAXBElement<String> value) {
        this.premiumModificationCode = value;
    }

    /**
     * Gets the value of the administrativeStringers property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdministrativeStringers() {
        return administrativeStringers;
    }

    /**
     * Sets the value of the administrativeStringers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdministrativeStringers(BigDecimal value) {
        this.administrativeStringers = value;
    }

    /**
     * Gets the value of the issuingRights property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIssuingRights() {
        return issuingRights;
    }

    /**
     * Sets the value of the issuingRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIssuingRights(BigDecimal value) {
        this.issuingRights = value;
    }

    /**
     * Gets the value of the amountSocialService property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountSocialService() {
        return amountSocialService;
    }

    /**
     * Sets the value of the amountSocialService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountSocialService(BigDecimal value) {
        this.amountSocialService = value;
    }

    /**
     * Gets the value of the amountSuperBankingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountSuperBankingRate() {
        return amountSuperBankingRate;
    }

    /**
     * Sets the value of the amountSuperBankingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountSuperBankingRate(BigDecimal value) {
        this.amountSuperBankingRate = value;
    }

    /**
     * Gets the value of the internalAmountOwnParty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInternalAmountOwnParty() {
        return internalAmountOwnParty;
    }

    /**
     * Sets the value of the internalAmountOwnParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInternalAmountOwnParty(BigDecimal value) {
        this.internalAmountOwnParty = value;
    }

    /**
     * Gets the value of the sealed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSealed() {
        return sealed;
    }

    /**
     * Sets the value of the sealed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSealed(BigDecimal value) {
        this.sealed = value;
    }

    /**
     * Gets the value of the originalBonus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalBonus() {
        return originalBonus;
    }

    /**
     * Sets the value of the originalBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalBonus(BigDecimal value) {
        this.originalBonus = value;
    }

    /**
     * Gets the value of the originalPrizeExternalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalPrizeExternalCurrency() {
        return originalPrizeExternalCurrency;
    }

    /**
     * Sets the value of the originalPrizeExternalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalPrizeExternalCurrency(BigDecimal value) {
        this.originalPrizeExternalCurrency = value;
    }

    /**
     * Gets the value of the originalPrizeUSD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalPrizeUSD() {
        return originalPrizeUSD;
    }

    /**
     * Sets the value of the originalPrizeUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalPrizeUSD(BigDecimal value) {
        this.originalPrizeUSD = value;
    }

    /**
     * Gets the value of the balanceExternalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceExternalCurrency() {
        return balanceExternalCurrency;
    }

    /**
     * Sets the value of the balanceExternalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceExternalCurrency(BigDecimal value) {
        this.balanceExternalCurrency = value;
    }

    /**
     * Gets the value of the balanceUSD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceUSD() {
        return balanceUSD;
    }

    /**
     * Sets the value of the balanceUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceUSD(BigDecimal value) {
        this.balanceUSD = value;
    }

    /**
     * Gets the value of the premiumGYH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremiumGYH() {
        return premiumGYH;
    }

    /**
     * Sets the value of the premiumGYH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremiumGYH(BigDecimal value) {
        this.premiumGYH = value;
    }

    /**
     * Gets the value of the balanceCollectionExternalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceCollectionExternalCurrency() {
        return balanceCollectionExternalCurrency;
    }

    /**
     * Sets the value of the balanceCollectionExternalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceCollectionExternalCurrency(BigDecimal value) {
        this.balanceCollectionExternalCurrency = value;
    }

    /**
     * Gets the value of the balanceCollectionUSD property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceCollectionUSD() {
        return balanceCollectionUSD;
    }

    /**
     * Sets the value of the balanceCollectionUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceCollectionUSD(BigDecimal value) {
        this.balanceCollectionUSD = value;
    }

    /**
     * Gets the value of the totalCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCommissionAmount() {
        return totalCommissionAmount;
    }

    /**
     * Sets the value of the totalCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCommissionAmount(BigDecimal value) {
        this.totalCommissionAmount = value;
    }

    /**
     * Gets the value of the totalDifferentialCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDifferentialCommission() {
        return totalDifferentialCommission;
    }

    /**
     * Sets the value of the totalDifferentialCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDifferentialCommission(BigDecimal value) {
        this.totalDifferentialCommission = value;
    }

    /**
     * Gets the value of the balanceCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceCommissionAmount() {
        return balanceCommissionAmount;
    }

    /**
     * Sets the value of the balanceCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceCommissionAmount(BigDecimal value) {
        this.balanceCommissionAmount = value;
    }

    /**
     * Gets the value of the balanceDifferentialCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceDifferentialCommission() {
        return balanceDifferentialCommission;
    }

    /**
     * Sets the value of the balanceDifferentialCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceDifferentialCommission(BigDecimal value) {
        this.balanceDifferentialCommission = value;
    }

    /**
     * Gets the value of the percentageAquisitionsExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageAquisitionsExpenses() {
        return percentageAquisitionsExpenses;
    }

    /**
     * Sets the value of the percentageAquisitionsExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageAquisitionsExpenses(BigDecimal value) {
        this.percentageAquisitionsExpenses = value;
    }

    /**
     * Gets the value of the referencePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReferencePolicy() {
        return referencePolicy;
    }

    /**
     * Sets the value of the referencePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReferencePolicy(BigDecimal value) {
        this.referencePolicy = value;
    }

    /**
     * Gets the value of the referenceEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceEndorsement() {
        return referenceEndorsement;
    }

    /**
     * Sets the value of the referenceEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceEndorsement(Integer value) {
        this.referenceEndorsement = value;
    }

    /**
     * Gets the value of the itemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemQuantity(BigDecimal value) {
        this.itemQuantity = value;
    }

    /**
     * Gets the value of the cancelledOperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelledOperation() {
        return cancelledOperation;
    }

    /**
     * Sets the value of the cancelledOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelledOperation(JAXBElement<String> value) {
        this.cancelledOperation = value;
    }

    /**
     * Gets the value of the lastInstallmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInstallmentDate() {
        return lastInstallmentDate;
    }

    /**
     * Sets the value of the lastInstallmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInstallmentDate(XMLGregorianCalendar value) {
        this.lastInstallmentDate = value;
    }

    /**
     * Gets the value of the reasonForMovement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonForMovement() {
        return reasonForMovement;
    }

    /**
     * Sets the value of the reasonForMovement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonForMovement(JAXBElement<String> value) {
        this.reasonForMovement = value;
    }

    /**
     * Gets the value of the frequencyRebilling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequencyRebilling() {
        return frequencyRebilling;
    }

    /**
     * Sets the value of the frequencyRebilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequencyRebilling(JAXBElement<String> value) {
        this.frequencyRebilling = value;
    }

    /**
     * Gets the value of the morABase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMorABase() {
        return morABase;
    }

    /**
     * Sets the value of the morABase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMorABase(BigDecimal value) {
        this.morABase = value;
    }

    /**
     * Gets the value of the documentPerCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentPerCurrency() {
        return documentPerCurrency;
    }

    /**
     * Sets the value of the documentPerCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentPerCurrency(JAXBElement<String> value) {
        this.documentPerCurrency = value;
    }

    /**
     * Gets the value of the docum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocum() {
        return docum;
    }

    /**
     * Sets the value of the docum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocum(JAXBElement<String> value) {
        this.docum = value;
    }

    /**
     * Gets the value of the taxPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxPosition() {
        return taxPosition;
    }

    /**
     * Sets the value of the taxPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxPosition(JAXBElement<String> value) {
        this.taxPosition = value;
    }

    /**
     * Gets the value of the agentCollection1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentCollection1() {
        return agentCollection1;
    }

    /**
     * Sets the value of the agentCollection1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentCollection1(BigDecimal value) {
        this.agentCollection1 = value;
    }

    /**
     * Gets the value of the commissionorCollection1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionorCollection1() {
        return commissionorCollection1;
    }

    /**
     * Sets the value of the commissionorCollection1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionorCollection1(BigDecimal value) {
        this.commissionorCollection1 = value;
    }

    /**
     * Gets the value of the commissionorCollection1Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommissionorCollection1Code() {
        return commissionorCollection1Code;
    }

    /**
     * Sets the value of the commissionorCollection1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommissionorCollection1Code(JAXBElement<String> value) {
        this.commissionorCollection1Code = value;
    }

    /**
     * Gets the value of the agentCollection2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentCollection2() {
        return agentCollection2;
    }

    /**
     * Sets the value of the agentCollection2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentCollection2(BigDecimal value) {
        this.agentCollection2 = value;
    }

    /**
     * Gets the value of the commissionorCollection2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionorCollection2() {
        return commissionorCollection2;
    }

    /**
     * Sets the value of the commissionorCollection2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionorCollection2(BigDecimal value) {
        this.commissionorCollection2 = value;
    }

    /**
     * Gets the value of the commissionorCollection2Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommissionorCollection2Code() {
        return commissionorCollection2Code;
    }

    /**
     * Sets the value of the commissionorCollection2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommissionorCollection2Code(JAXBElement<String> value) {
        this.commissionorCollection2Code = value;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxTotal() {
        return taxTotal;
    }

    /**
     * Sets the value of the taxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxTotal(BigDecimal value) {
        this.taxTotal = value;
    }

    /**
     * Gets the value of the percentageCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageCommission() {
        return percentageCommission;
    }

    /**
     * Sets the value of the percentageCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageCommission(BigDecimal value) {
        this.percentageCommission = value;
    }

    /**
     * Gets the value of the camp02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCamp02() {
        return camp02;
    }

    /**
     * Sets the value of the camp02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCamp02(JAXBElement<String> value) {
        this.camp02 = value;
    }

    /**
     * Gets the value of the percentageEarthquakeCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageEarthquakeCommission() {
        return percentageEarthquakeCommission;
    }

    /**
     * Sets the value of the percentageEarthquakeCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageEarthquakeCommission(BigDecimal value) {
        this.percentageEarthquakeCommission = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyType(Integer value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodicity() {
        return periodicity;
    }

    /**
     * Sets the value of the periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodicity(BigDecimal value) {
        this.periodicity = value;
    }

    /**
     * Gets the value of the typeofInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeofInsurance() {
        return typeofInsurance;
    }

    /**
     * Sets the value of the typeofInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeofInsurance(JAXBElement<String> value) {
        this.typeofInsurance = value;
    }

    /**
     * Gets the value of the typeofBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeofBusiness() {
        return typeofBusiness;
    }

    /**
     * Sets the value of the typeofBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeofBusiness(Integer value) {
        this.typeofBusiness = value;
    }

    /**
     * Gets the value of the yearorMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYearorMonth() {
        return yearorMonth;
    }

    /**
     * Sets the value of the yearorMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYearorMonth(BigDecimal value) {
        this.yearorMonth = value;
    }

    /**
     * Gets the value of the typeofAssurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeofAssurance() {
        return typeofAssurance;
    }

    /**
     * Sets the value of the typeofAssurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeofAssurance(JAXBElement<String> value) {
        this.typeofAssurance = value;
    }

    /**
     * Gets the value of the indemnityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndemnityPeriod() {
        return indemnityPeriod;
    }

    /**
     * Sets the value of the indemnityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndemnityPeriod(BigDecimal value) {
        this.indemnityPeriod = value;
    }

    /**
     * Gets the value of the businessInterruption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessInterruption() {
        return businessInterruption;
    }

    /**
     * Sets the value of the businessInterruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessInterruption(JAXBElement<String> value) {
        this.businessInterruption = value;
    }

    /**
     * Gets the value of the accommodationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccommodationPolicy() {
        return accommodationPolicy;
    }

    /**
     * Sets the value of the accommodationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccommodationPolicy(BigDecimal value) {
        this.accommodationPolicy = value;
    }

    /**
     * Gets the value of the accountingIndicatorPremiumPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountingIndicatorPremiumPaid() {
        return accountingIndicatorPremiumPaid;
    }

    /**
     * Sets the value of the accountingIndicatorPremiumPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountingIndicatorPremiumPaid(JAXBElement<String> value) {
        this.accountingIndicatorPremiumPaid = value;
    }

    /**
     * Gets the value of the beneficiaryNit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeneficiaryNit() {
        return beneficiaryNit;
    }

    /**
     * Sets the value of the beneficiaryNit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeneficiaryNit(BigDecimal value) {
        this.beneficiaryNit = value;
    }

    /**
     * Gets the value of the percentagePortionLeader property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentagePortionLeader() {
        return percentagePortionLeader;
    }

    /**
     * Sets the value of the percentagePortionLeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentagePortionLeader(BigDecimal value) {
        this.percentagePortionLeader = value;
    }

    /**
     * Gets the value of the percentageCoInsuranceCeded property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageCoInsuranceCeded() {
        return percentageCoInsuranceCeded;
    }

    /**
     * Sets the value of the percentageCoInsuranceCeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageCoInsuranceCeded(BigDecimal value) {
        this.percentageCoInsuranceCeded = value;
    }

    /**
     * Gets the value of the coverageExtention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoverageExtention() {
        return coverageExtention;
    }

    /**
     * Sets the value of the coverageExtention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoverageExtention(JAXBElement<String> value) {
        this.coverageExtention = value;
    }

    /**
     * Gets the value of the coInsuranceCeded property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoInsuranceCeded() {
        return coInsuranceCeded;
    }

    /**
     * Sets the value of the coInsuranceCeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoInsuranceCeded(BigDecimal value) {
        this.coInsuranceCeded = value;
    }

    /**
     * Gets the value of the lobReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLOBReference() {
        return lobReference;
    }

    /**
     * Sets the value of the lobReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLOBReference(BigDecimal value) {
        this.lobReference = value;
    }

    /**
     * Gets the value of the policyReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyReference() {
        return policyReference;
    }

    /**
     * Sets the value of the policyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyReference(BigDecimal value) {
        this.policyReference = value;
    }

    /**
     * Gets the value of the percentageBusinessInterruption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageBusinessInterruption() {
        return percentageBusinessInterruption;
    }

    /**
     * Sets the value of the percentageBusinessInterruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageBusinessInterruption(BigDecimal value) {
        this.percentageBusinessInterruption = value;
    }

    /**
     * Gets the value of the additionalExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalExpenses() {
        return additionalExpenses;
    }

    /**
     * Sets the value of the additionalExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalExpenses(BigDecimal value) {
        this.additionalExpenses = value;
    }

    /**
     * Gets the value of the startingReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartingReleaseDate() {
        return startingReleaseDate;
    }

    /**
     * Sets the value of the startingReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartingReleaseDate(XMLGregorianCalendar value) {
        this.startingReleaseDate = value;
    }

    /**
     * Gets the value of the finishingReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishingReleaseDate() {
        return finishingReleaseDate;
    }

    /**
     * Sets the value of the finishingReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishingReleaseDate(XMLGregorianCalendar value) {
        this.finishingReleaseDate = value;
    }

    /**
     * Gets the value of the grossTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossTaxes() {
        return grossTaxes;
    }

    /**
     * Sets the value of the grossTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossTaxes(BigDecimal value) {
        this.grossTaxes = value;
    }

    /**
     * Gets the value of the civilEngineeringTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCivilEngineeringTerm() {
        return civilEngineeringTerm;
    }

    /**
     * Sets the value of the civilEngineeringTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCivilEngineeringTerm(BigDecimal value) {
        this.civilEngineeringTerm = value;
    }

    /**
     * Gets the value of the typeofAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTypeofAssembly() {
        return typeofAssembly;
    }

    /**
     * Sets the value of the typeofAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTypeofAssembly(BigDecimal value) {
        this.typeofAssembly = value;
    }

    /**
     * Gets the value of the agencyBillingSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgencyBillingSerialNumber() {
        return agencyBillingSerialNumber;
    }

    /**
     * Sets the value of the agencyBillingSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgencyBillingSerialNumber(BigDecimal value) {
        this.agencyBillingSerialNumber = value;
    }

    /**
     * Gets the value of the billingConsecutiveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillingConsecutiveNumber() {
        return billingConsecutiveNumber;
    }

    /**
     * Sets the value of the billingConsecutiveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillingConsecutiveNumber(BigDecimal value) {
        this.billingConsecutiveNumber = value;
    }

    /**
     * Gets the value of the renovationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenovationNumber() {
        return renovationNumber;
    }

    /**
     * Sets the value of the renovationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenovationNumber(BigDecimal value) {
        this.renovationNumber = value;
    }

    /**
     * Gets the value of the policyMarkOLE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyMarkOLE() {
        return policyMarkOLE;
    }

    /**
     * Sets the value of the policyMarkOLE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyMarkOLE(JAXBElement<String> value) {
        this.policyMarkOLE = value;
    }

    /**
     * Gets the value of the typeofMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTypeofMaintenance() {
        return typeofMaintenance;
    }

    /**
     * Sets the value of the typeofMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTypeofMaintenance(BigDecimal value) {
        this.typeofMaintenance = value;
    }

    /**
     * Gets the value of the maintenanceStartingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintenanceStartingDate() {
        return maintenanceStartingDate;
    }

    /**
     * Sets the value of the maintenanceStartingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintenanceStartingDate(XMLGregorianCalendar value) {
        this.maintenanceStartingDate = value;
    }

    /**
     * Gets the value of the maintenanceFinishingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintenanceFinishingDate() {
        return maintenanceFinishingDate;
    }

    /**
     * Sets the value of the maintenanceFinishingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintenanceFinishingDate(XMLGregorianCalendar value) {
        this.maintenanceFinishingDate = value;
    }

    /**
     * Gets the value of the maintenanceTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaintenanceTerms() {
        return maintenanceTerms;
    }

    /**
     * Sets the value of the maintenanceTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaintenanceTerms(BigDecimal value) {
        this.maintenanceTerms = value;
    }

    /**
     * Gets the value of the startingTestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartingTestDate() {
        return startingTestDate;
    }

    /**
     * Sets the value of the startingTestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartingTestDate(XMLGregorianCalendar value) {
        this.startingTestDate = value;
    }

    /**
     * Gets the value of the finishingTestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishingTestDate() {
        return finishingTestDate;
    }

    /**
     * Sets the value of the finishingTestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishingTestDate(XMLGregorianCalendar value) {
        this.finishingTestDate = value;
    }

    /**
     * Gets the value of the testTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTestTerm() {
        return testTerm;
    }

    /**
     * Sets the value of the testTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTestTerm(BigDecimal value) {
        this.testTerm = value;
    }

    /**
     * Gets the value of the startingProdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartingProdDate() {
        return startingProdDate;
    }

    /**
     * Sets the value of the startingProdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartingProdDate(XMLGregorianCalendar value) {
        this.startingProdDate = value;
    }

    /**
     * Gets the value of the finishingProdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishingProdDate() {
        return finishingProdDate;
    }

    /**
     * Sets the value of the finishingProdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishingProdDate(XMLGregorianCalendar value) {
        this.finishingProdDate = value;
    }

    /**
     * Gets the value of the prodTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProdTerm() {
        return prodTerm;
    }

    /**
     * Sets the value of the prodTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProdTerm(BigDecimal value) {
        this.prodTerm = value;
    }

    /**
     * Gets the value of the brokerOperationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrokerOperationNumber() {
        return brokerOperationNumber;
    }

    /**
     * Sets the value of the brokerOperationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrokerOperationNumber(BigDecimal value) {
        this.brokerOperationNumber = value;
    }

    /**
     * Gets the value of the appendixRelated property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppendixRelated() {
        return appendixRelated;
    }

    /**
     * Sets the value of the appendixRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppendixRelated(BigDecimal value) {
        this.appendixRelated = value;
    }

    /**
     * Gets the value of the multinationalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMultinationalCode() {
        return multinationalCode;
    }

    /**
     * Sets the value of the multinationalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMultinationalCode(JAXBElement<String> value) {
        this.multinationalCode = value;
    }

    /**
     * Gets the value of the balanceIvaValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceIvaValue() {
        return balanceIvaValue;
    }

    /**
     * Sets the value of the balanceIvaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceIvaValue(BigDecimal value) {
        this.balanceIvaValue = value;
    }

    /**
     * Gets the value of the balanceExpressValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceExpressValue() {
        return balanceExpressValue;
    }

    /**
     * Sets the value of the balanceExpressValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceExpressValue(BigDecimal value) {
        this.balanceExpressValue = value;
    }

    /**
     * Gets the value of the balancePremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalancePremium() {
        return balancePremium;
    }

    /**
     * Sets the value of the balancePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalancePremium(BigDecimal value) {
        this.balancePremium = value;
    }

    /**
     * Gets the value of the businessSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusinessSize() {
        return businessSize;
    }

    /**
     * Sets the value of the businessSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessSize(Integer value) {
        this.businessSize = value;
    }

    /**
     * Gets the value of the updateDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdateDatabase() {
        return updateDatabase;
    }

    /**
     * Sets the value of the updateDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdateDatabase(JAXBElement<String> value) {
        this.updateDatabase = value;
    }

    /**
     * Gets the value of the interfMarkI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfMarkI() {
        return interfMarkI;
    }

    /**
     * Sets the value of the interfMarkI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfMarkI(JAXBElement<String> value) {
        this.interfMarkI = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUser(JAXBElement<String> value) {
        this.user = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteNumber(JAXBElement<String> value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the endrc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENDRC() {
        return endrc;
    }

    /**
     * Sets the value of the endrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENDRC(JAXBElement<String> value) {
        this.endrc = value;
    }

    /**
     * Gets the value of the fieldOfficeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldOfficeID() {
        return fieldOfficeID;
    }

    /**
     * Sets the value of the fieldOfficeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldOfficeID(Integer value) {
        this.fieldOfficeID = value;
    }

    /**
     * Gets the value of the policyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyStartDate() {
        return policyStartDate;
    }

    /**
     * Sets the value of the policyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyStartDate(XMLGregorianCalendar value) {
        this.policyStartDate = value;
    }

    /**
     * Gets the value of the policyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyEndDate() {
        return policyEndDate;
    }

    /**
     * Sets the value of the policyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyEndDate(XMLGregorianCalendar value) {
        this.policyEndDate = value;
    }

    /**
     * Gets the value of the insuredCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredCode() {
        return insuredCode;
    }

    /**
     * Sets the value of the insuredCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredCode(JAXBElement<String> value) {
        this.insuredCode = value;
    }

    /**
     * Gets the value of the brokerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrokerID() {
        return brokerID;
    }

    /**
     * Sets the value of the brokerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrokerID(Integer value) {
        this.brokerID = value;
    }

    /**
     * Gets the value of the policyQuoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyQuoteNumber() {
        return policyQuoteNumber;
    }

    /**
     * Sets the value of the policyQuoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyQuoteNumber(JAXBElement<String> value) {
        this.policyQuoteNumber = value;
    }

    /**
     * Gets the value of the underwriterAreaShortname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnderwriterAreaShortname() {
        return underwriterAreaShortname;
    }

    /**
     * Sets the value of the underwriterAreaShortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnderwriterAreaShortname(JAXBElement<String> value) {
        this.underwriterAreaShortname = value;
    }

    /**
     * Gets the value of the brokerReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrokerReference() {
        return brokerReference;
    }

    /**
     * Sets the value of the brokerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrokerReference(JAXBElement<String> value) {
        this.brokerReference = value;
    }

    /**
     * Gets the value of the pacprCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPACPRCode() {
        return pacprCode;
    }

    /**
     * Sets the value of the pacprCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPACPRCode(JAXBElement<String> value) {
        this.pacprCode = value;
    }

    /**
     * Gets the value of the segmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegmentCode() {
        return segmentCode;
    }

    /**
     * Sets the value of the segmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegmentCode(JAXBElement<String> value) {
        this.segmentCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBranchCode(Integer value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the businessProcessingUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessProcessingUnitCode() {
        return businessProcessingUnitCode;
    }

    /**
     * Sets the value of the businessProcessingUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessProcessingUnitCode(JAXBElement<String> value) {
        this.businessProcessingUnitCode = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactID(Integer value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the directAssumedCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectAssumedCode() {
        return directAssumedCode;
    }

    /**
     * Sets the value of the directAssumedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectAssumedCode(JAXBElement<String> value) {
        this.directAssumedCode = value;
    }

    /**
     * Gets the value of the distributionChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributionChannelCode() {
        return distributionChannelCode;
    }

    /**
     * Sets the value of the distributionChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributionChannelCode(JAXBElement<String> value) {
        this.distributionChannelCode = value;
    }

    /**
     * Gets the value of the exclusiveFlagCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExclusiveFlagCode() {
        return exclusiveFlagCode;
    }

    /**
     * Sets the value of the exclusiveFlagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExclusiveFlagCode(JAXBElement<String> value) {
        this.exclusiveFlagCode = value;
    }

    /**
     * Gets the value of the fieldOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldOfficeCode() {
        return fieldOfficeCode;
    }

    /**
     * Sets the value of the fieldOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldOfficeCode(JAXBElement<String> value) {
        this.fieldOfficeCode = value;
    }

    /**
     * Gets the value of the freedomofServicesFlagCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreedomofServicesFlagCode() {
        return freedomofServicesFlagCode;
    }

    /**
     * Sets the value of the freedomofServicesFlagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreedomofServicesFlagCode(JAXBElement<String> value) {
        this.freedomofServicesFlagCode = value;
    }

    /**
     * Gets the value of the insuranceCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceCompanyCode() {
        return insuranceCompanyCode;
    }

    /**
     * Sets the value of the insuranceCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceCompanyCode(JAXBElement<String> value) {
        this.insuranceCompanyCode = value;
    }

    /**
     * Gets the value of the insuredID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredID() {
        return insuredID;
    }

    /**
     * Sets the value of the insuredID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredID(Integer value) {
        this.insuredID = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentTypeCode(JAXBElement<String> value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the policyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyPeriod() {
        return policyPeriod;
    }

    /**
     * Sets the value of the policyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyPeriod(JAXBElement<String> value) {
        this.policyPeriod = value;
    }

    /**
     * Gets the value of the policyStateID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyStateID() {
        return policyStateID;
    }

    /**
     * Sets the value of the policyStateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyStateID(JAXBElement<String> value) {
        this.policyStateID = value;
    }

    /**
     * Gets the value of the prefixID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrefixID() {
        return prefixID;
    }

    /**
     * Sets the value of the prefixID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrefixID(Integer value) {
        this.prefixID = value;
    }

    /**
     * Gets the value of the prefixMid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefixMid() {
        return prefixMid;
    }

    /**
     * Sets the value of the prefixMid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefixMid(JAXBElement<String> value) {
        this.prefixMid = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductID(Integer value) {
        this.productID = value;
    }

    /**
     * Gets the value of the programmeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgrammeTypeCode() {
        return programmeTypeCode;
    }

    /**
     * Sets the value of the programmeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgrammeTypeCode(JAXBElement<String> value) {
        this.programmeTypeCode = value;
    }

    /**
     * Gets the value of the stateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateID(Integer value) {
        this.stateID = value;
    }

    /**
     * Gets the value of the underwriterID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnderwriterID() {
        return underwriterID;
    }

    /**
     * Sets the value of the underwriterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnderwriterID(Integer value) {
        this.underwriterID = value;
    }

}
