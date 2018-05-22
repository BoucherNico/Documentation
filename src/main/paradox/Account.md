# Compte (Account)

Un compte est une personne, physique ou morale, en relation avec la plateforme de service.

## Types d'enregistrement

|Type| Description |
|--|--|
| Partenaire | Partenaires producteurs de services |
| Compte personnel | Personnes physiques clientes de la PFS |
| Compte personnel Digiteam | Personnes physiques créées par la Digiteam |

## Champs

| API Name | Etiquette | Type | Description |
|--|--|--|--|
| Id |  |  | Identifiant technique de l'enregistrement (variable selon les environnements) |
| FirstName | Prénom | String(80) | Nom de la Taxe |

## Relations

### Objets liés aux Taxes

 - @ref:[Entrée du Catalogue de Prix](PriceBookEntry.md) : **Entrees_du_catalogue_de_prix__r**

## Consultation
Voici un exemple au format JSON de la consultation d'une Taxe :

    GET
    /services/data/v43.0/sobjects/Taxe__c/a086E000001tGGLQA2
    
    {
		"attributes" : {
	    "type" : "Account",
	    "url" : "/services/data/v43.0/sobjects/Account/0016E00000Ww9GKQAZ"
		},
	"Id" : "0016E00000Ww9GKQAZ",
	"IsDeleted" : false,
	"MasterRecordId" : null,
	"Name" : "John DOE",
	"LastName" : "DOE",
	"FirstName" : "John",
	"Salutation" : "Monsieur",
	"Type" : null,
	"RecordTypeId" : "0120Y000000RXpxQAG",
	"ParentId" : null,
	"BillingStreet" : null,
	"BillingCity" : null,
	"BillingState" : null,
	"BillingPostalCode" : null,
	"BillingCountry" : "FRANCE",
	"BillingLatitude" : null,
	"BillingLongitude" : null,
	"BillingGeocodeAccuracy" : null,
	"BillingAddress" : {
	    "city" : null,
	    "country" : "FRANCE",
	    "geocodeAccuracy" : null,
	    "latitude" : null,
	    "longitude" : null,
	    "postalCode" : null,
	    "state" : null,
	    "street" : null
	},
	"ShippingStreet" : null,
	"ShippingCity" : null,
	"ShippingState" : null,
	"ShippingPostalCode" : null,
	"ShippingCountry" : null,
	"ShippingLatitude" : null,
	"ShippingLongitude" : null,
	"ShippingGeocodeAccuracy" : null,
	"ShippingAddress" : null,
	"Phone" : null,
	"Website" : null,
	"PhotoUrl" : "/services/images/photo/0016E00000Ww9GKQAZ",
	"Industry" : null,
	"NumberOfEmployees" : null,
	"Description" : null,
	"OwnerId" : "0050Y000003ryMCQAY",
	"CreatedDate" : "2018-05-22T12:09:13.000+0000",
	"CreatedById" : "0050Y000003ryMCQAY",
	"LastModifiedDate" : "2018-05-22T12:09:15.000+0000",
	"LastModifiedById" : "0050Y000003ryMCQAY",
	"SystemModstamp" : "2018-05-22T12:09:15.000+0000",
	"LastActivityDate" : null,
"LastViewedDate" : "2018-05-22T12:15:22.000+0000",
"LastReferencedDate" : "2018-05-22T12:15:22.000+0000",
"PersonContactId" : "0036E00000PBR6RQAX",
"IsPersonAccount" : true,
"PersonMailingStreet" : null,
"PersonMailingCity" : null,
"PersonMailingState" : null,
"PersonMailingPostalCode" : null,
"PersonMailingCountry" : "FRANCE",
"PersonMailingLatitude" : null,
"PersonMailingLongitude" : null,
"PersonMailingGeocodeAccuracy" : null,
"PersonMailingAddress" : {
    "city" : null,
    "country" : "FRANCE",
    "geocodeAccuracy" : null,
    "latitude" : null,
    "longitude" : null,
    "postalCode" : null,
    "state" : null,
    "street" : null
		},
		"PersonMobilePhone" : null,
		"PersonHomePhone" : null,
		"PersonEmail" : "j.doe@example.fr",
		"PersonTitle" : null,
		"PersonDepartment" : null,
		"PersonLastCURequestDate" : null,
		"PersonLastCUUpdateDate" : null,
		"PersonEmailBouncedReason" : null,
		"PersonEmailBouncedDate" : null,
		"Jigsaw" : null,
		"JigsawCompanyId" : null,
		"AccountSource" : null,
		"SicDesc" : null,
		"IdPersonne__c" : null,
		"Id_MAIF__c" : "5b04086b5517008aac159c95",
		"Note_moyenne__c" : null,
		"Nombre_de_notes__c" : 0.0,
		"TECH_Somme_des_notes__c" : 0.0,
		"Id_Compte__c" : null,
		"Logo__c" : null,
		"Moyenne_Note_Satisfaction_Partenaire__c" : null,
		"SIRET__c" : null,
		"Univers__c" : null,
		"CA_genere__c" : 0.0,
		"Fiche_partenaire__c" : "<a href=\" \" target=\"_self\">ici</a>",
		"Lien_vers_fiche_partenaire__c" : null,
		"IdMAIFConnect__pc" : null,
		"Age__pc" : null,
		"Adresse__pc" : "-",
		"Canal_prefere__pc" : null,
		"Disponibilite__pc" : null,
		"ID_Siebel__pc" : null,
		"N_societaire__pc" : null,
		"Opt_in_Email__pc" : false,
		"Personne_contacter__pc" : false,
		"Refus_sollicitation__pc" : false,
		"Statut__pc" : null,
		"Code_postal__pc" : null,
		"IdPersonne__pc" : null,
		"Opt_in_Email_Maif__pc" : "Non",
		"Opt_in_Email_Partenaire_Maif__pc" : "Non",
		"Opt_in_telephone_Maif__pc" : null,
		"Rue__pc" : null,
		"Tech_Adresse__pc" : "-",
		"Ville_Commune__pc" : null
	}

## Enregistrement

Voici un exemple au format JSON de la création d'une Taxe :

	POST
	/services/data/v43.0/sobjects/Taxe__c/
	
	{
		"Name" : "TVA : 1,1 %",
		"Taux__c" : 1.10
	}
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTM5MDIxMzkyNSwxNjg2MTcxMjkzLC0xOD
kzMjg2NTgzXX0=
-->