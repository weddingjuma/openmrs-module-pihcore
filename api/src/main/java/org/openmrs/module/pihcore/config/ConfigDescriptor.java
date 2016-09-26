package org.openmrs.module.pihcore.config;

import org.codehaus.jackson.annotate.JsonProperty;
import org.openmrs.module.pihcore.config.registration.RegistrationConfigDescriptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Object that encapsulates the options that can be configured on a per-installation basis
 */
public class ConfigDescriptor {

    public enum Country {
        HAITI, LIBERIA, SIERRA_LEONE, OTHER
    }

    public enum Site {
        MIREBALAIS, LACOLLINE, THOMONDE, ZLTRAINING,
        PLEEBO, OTHER, CROSS_SITE
    }

    @JsonProperty
    private String welcomeMessage;

    @JsonProperty
    private String dashboardUrl;

    @JsonProperty
    private String afterMergeUrl;

    @JsonProperty
    private String visitsPageUrl;

    @JsonProperty
    private String visitsPageWithSpecificUrl;

    @JsonProperty
    private Country country;

    @JsonProperty
    private Site site;

    @JsonProperty
    private Map<String, String> globalProperties;

    @JsonProperty
    private List<String> components;

    @JsonProperty
    private String providerIdentifierPrefix;

    @JsonProperty
    private String dossierIdentifierPrefix;

    @JsonProperty
    private List<String> extraIdentifierTypes;

    @JsonProperty
    private String dispositionConfig; // override the default disposition config file to use

    @JsonProperty
    private Boolean scheduleBackupReports; // whether or not to schedule a set of reports to be exported to disk regularly as a backup in case of downtime (see scheduleBackupReports method in Mirebalais Module Activator), generally this should only be turned on on production

    @JsonProperty
    private Boolean scheduleMonthlyDataExports; // whether or not to schedule the full data export to run monthly on the 5th of each month

    @JsonProperty
    private String idCardLabel;  // label printed on the standard PIH ID card

    @JsonProperty
    private Locale idCardLocale;  // language/locale of labels on on PIH ID card

    @JsonProperty
    private RegistrationConfigDescriptor registrationConfig;

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getDashboardUrl() { return dashboardUrl; }

    public void setDashboardUrl(String dashboardUrl) { this.dashboardUrl = dashboardUrl; }

    public String getAfterMergeUrl() { return afterMergeUrl; }

    public void setAfterMergeUrl(String afterMergeUrl) { this.afterMergeUrl = afterMergeUrl; }

    public String getVisitsPageUrl() { return visitsPageUrl; }

    public void setVisitsPageUrl(String visitsPageUrl) { this.visitsPageUrl = visitsPageUrl; }

    public String getVisitsPageWithSpecificUrl() {
        return visitsPageWithSpecificUrl;
    }

    public void setVisitsPageWithSpecificUrl(String visitsPageWithSpecificUrl) {
        this.visitsPageWithSpecificUrl = visitsPageWithSpecificUrl;
    }

    public Map<String, String> getGlobalProperties() {
        return globalProperties;
    }

    public void setGlobalProperties(Map<String, String> globalProperties) {
        this.globalProperties = globalProperties;
    }

    public List<String> getComponents() {
        if (components == null) {
            components = new ArrayList<String>();
        }
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public String getProviderIdentifierPrefix() {
        return providerIdentifierPrefix;
    }

    public void setProviderIdentifierPrefix(String providerIdentifierPrefix) {
        this.providerIdentifierPrefix = providerIdentifierPrefix;
    }

    public String getDossierIdentifierPrefix() {
        return dossierIdentifierPrefix;
    }

    public void setDossierIdentifierPrefix(String dossierIdentifierPrefix) {
        this.dossierIdentifierPrefix = dossierIdentifierPrefix;
    }

    public List<String> getExtraIdentifierTypes() {
        return extraIdentifierTypes;
    }

    public void setExtraIdentifierTypes(List<String> extraIdentifierTypes) {
        this.extraIdentifierTypes = extraIdentifierTypes;
    }

    public String getDispositionConfig() {
        return dispositionConfig;
    }

    public void setDispositionConfig(String dispositionConfig) {
        this.dispositionConfig = dispositionConfig;
    }

    public Boolean getScheduleBackupReports() {
        return scheduleBackupReports;
    }

    public void setScheduleBackupReports(Boolean scheduleBackupReports) {
        this.scheduleBackupReports = scheduleBackupReports;
    }

    public Boolean getScheduleMonthlyDataExports() {
        return scheduleMonthlyDataExports;
    }

    public void setScheduleMonthlyDataExports(Boolean scheduleMonthlyDataExports) {
        this.scheduleMonthlyDataExports = scheduleMonthlyDataExports;
    }

    public String getIdCardLabel() {
        return idCardLabel;
    }

    public void setIdCardLabel(String idCardLabel) {
        this.idCardLabel = idCardLabel;
    }

    public Locale getIdCardLocale() {
        return idCardLocale;
    }

    public void setIdCardLocale(Locale idCardLocale) {
        this.idCardLocale = idCardLocale;
    }

    public RegistrationConfigDescriptor getRegistrationConfig() {
        if (registrationConfig == null) {
            registrationConfig = new RegistrationConfigDescriptor();
        }
        return registrationConfig;
    }

    public void setRegistrationConfig(RegistrationConfigDescriptor registrationConfig) {
        this.registrationConfig = registrationConfig;
    }
}
