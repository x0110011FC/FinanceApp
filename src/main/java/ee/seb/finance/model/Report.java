package ee.seb.finance.model;

import javax.persistence.*;

@Entity
@Table(name="findoc")
public class Report {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="Doc_id")
    private String docId;

    @Column(name="Customer_id")
    private String customerId;

    @Column(name="Financial_date")
    private String financialDate;

    @Column(name="Flg_audit")
    private String auditFlag;

    @Column(name="No_months")
    private String numberOfMonths;

    @Column(name="Valid_from")
    private String validFrom;

    @Column(name="Valid_to")
    private String validTo;

    public Long getId() {
        return id;
    }

    public String getDocId() {
        return docId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFinancialDate() {
        return financialDate;
    }

    public String getAuditFlag() {
        return auditFlag;
    }

    public String getNumberOfMonths() {
        return numberOfMonths;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFinancialDate(String financialDate) {
        this.financialDate = financialDate;
    }

    public void setAuditFlag(String auditFlag) {
        this.auditFlag = auditFlag;
    }

    public void setNumberOfMonths(String numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
}
