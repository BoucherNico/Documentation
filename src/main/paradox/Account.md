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
| Name | 
| FirstName | Prénom | String(80) | Nom de la Taxe |
| LastName |  |  |  |  |  |  |
| FirstName |  |  |  |  |  |  |
| Salutation |  |  |  |  |  |  |
| Type |  |  |  |  |  |  |
| RecordTypeId |  |  |  |  |  |  |
| BillingStreet |  |  |  |  |  |  |
| BillingCity |  |  |  |  |  |  |
| BillingState |  |  |  |  |  |  |
| BillingPostalCode |  |  |  |  |  |  |
| BillingCountry |  |  |  |  |  |  |
| BillingLatitude |  |  |  |  |  |  |
| BillingLongitude |  |  |  |  |  |  |
| BillingGeocodeAccuracy |  |  |  |  |  |  |
| BillingAddress |  |  |  |  |  |  |
| city |  |  |  |  |  |  |
| country |  |  |  |  |  |  |
| geocodeAccuracy |  |  |  |  |  |  |
| latitude |  |  |  |  |  |  |
| longitude |  |  |  |  |  |  |
| postalCode |  |  |  |  |  |  |
| state |  |  |  |  |  |  |
| street |  |  |  |  |  |  |
	},
| ShippingStreet |  |  |  |  |  |  |
| ShippingCity |  |  |  |  |  |  |
| ShippingState |  |  |  |  |  |  |
| ShippingPostalCode |  |  |  |  |  |  |
| ShippingCountry |  |  |  |  |  |  |
| ShippingLatitude |  |  |  |  |  |  |
| ShippingLongitude |  |  |  |  |  |  |
| ShippingGeocodeAccuracy |  |  |  |  |  |  |
| ShippingAddress |  |  |  |  |  |  |
| Phone |  |  |  |  |  |  |
| Website |  |  |  |  |  |  |
| PhotoUrl |  |  |  |  |  |  |
| Industry |  |  |  |  |  |  |
| NumberOfEmployees |  |  |  |  |  |  |
| Description |  |  |  |  |  |  |
| CreatedDate |  |  |  |  |  |  |
| LastModifiedDate |  |  |  |  |  |  |
| PersonContactId |  |  |  |  |  |  |
| IsPersonAccount |  |  |  |  |  |  |
| PersonMailingStreet |  |  |  |  |  |  |
| PersonMailingCity |  |  |  |  |  |  |
| PersonMailingState |  |  |  |  |  |  |
| PersonMailingPostalCode |  |  |  |  |  |  |
| PersonMailingCountry |  |  |  |  |  |  |
| PersonMailingLatitude |  |  |  |  |  |  |
| PersonMailingLongitude |  |  |  |  |  |  |
| PersonMailingGeocodeAccuracy |  |  |  |  |  |  |
| PersonMailingAddress |  |  |  |  |  |  |
| city |  |  |  |  |  |  |
| country |  |  |  |  |  |  |
| geocodeAccuracy |  |  |  |  |  |  |
| latitude |  |  |  |  |  |  |
| longitude |  |  |  |  |  |  |
| postalCode |  |  |  |  |  |  |
| state |  |  |  |  |  |  |
| street |  |  |  |  |  |  |
	},
| PersonMobilePhone |  |  |  |  |  |  |
| PersonHomePhone |  |  |  |  |  |  |
| PersonEmail |  |  |  |  |  |  |
| PersonTitle |  |  |  |  |  |  |
| PersonDepartment |  |  |  |  |  |  |
| IdPersonne__c |  |  |  |  |  |  |
| Id_MAIF__c |  |  |  |  |  |  |
| Note_moyenne__c |  |  |  |  |  |  |
| Nombre_de_notes__c |  |  |  |  |  |  |
| TECH_Somme_des_notes__c |  |  |  |  |  |  |
| Id_Compte__c |  |  |  |  |  |  |
| Logo__c |  |  |  |  |  |  |
| SIRET__c |  |  |  |  |  |  |
| Univers__c |  |  |  |  |  |  |
| Fiche_partenaire__c |  |  |  |  |  |  |
| Age__pc |  |  |  |  |  |  |
| Canal_prefere__pc |  |  |  |  |  |  |
| Disponibilite__pc |  |  |  |  |  |  |
| N_societaire__pc |  |  |  |  |  |  |
| Opt_in_Email__pc |  |  |  |  |  |  |
| Personne_contacter__pc |  |  |  |  |  |  |
| Refus_sollicitation__pc |  |  |  |  |  |  |
| Statut__pc |  |  |  |  |  |  |
| Opt_in_Email_Maif__pc |  |  |  |  |  |  |
| Opt_in_Email_Partenaire_Maif__pc |  |  |  |  |  |  |
| Opt_in_telephone_Maif__pc |  |  |  |  |  |  |
| Tech_Adresse__pc |  |  |  |  |  |  |

## Relations

### Objets liés aux Taxes

 - @ref:[Entrée du Catalogue de Prix](PriceBookEntry.md) : **Entrees_du_catalogue_de_prix__r**

## Consultation
Voici un exemple au format JSON de la consultation d'un Account (exemple avec un compte personnel) :

    GET
    /services/data/v43.0/sobjects/Taxe__c/a086E000001tGGLQA2
    
    {
		"attributes" : {
		    "type" : "Account",
		    "url" : "/services/data/v43.0/sobjects/Account/0016E00000Ww9GKQAZ"
			},
		"Id" : "0016E00000Ww9GKQAZ",
		"Name" : "John DOE",
		"LastName" : "DOE",
		"FirstName" : "John",
		"Salutation" : "Monsieur",
		"Type" : null,
		"RecordTypeId" : "0120Y000000RXpxQAG",
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
		"CreatedDate" : "2018-05-22T12:09:13.000+0000",
		"LastModifiedDate" : "2018-05-22T12:09:15.000+0000",
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
		"IdPersonne__c" : null,
		"Id_MAIF__c" : "5b04086b5517008aac159c95",
		"Note_moyenne__c" : null,
		"Nombre_de_notes__c" : 0.0,
		"TECH_Somme_des_notes__c" : 0.0,
		"Id_Compte__c" : null,
		"Logo__c" : null,
		"SIRET__c" : null,
		"Univers__c" : null,
		"Fiche_partenaire__c" : "<a href=\" \" target=\"_self\">ici</a>",
		"Age__pc" : null,
		"Canal_prefere__pc" : null,
		"Disponibilite__pc" : null,
		"N_societaire__pc" : null,
		"Opt_in_Email__pc" : false,
		"Personne_contacter__pc" : false,
		"Refus_sollicitation__pc" : false,
		"Statut__pc" : null,
		"Opt_in_Email_Maif__pc" : "Non",
		"Opt_in_Email_Partenaire_Maif__pc" : "Non",
		"Opt_in_telephone_Maif__pc" : null,
		"Tech_Adresse__pc" : "-",
	}

## Enregistrement

Voici un exemple au format JSON de la création d'un Compte :

	POST
	/services/data/v43.0/sobjects/Account/
	
	{
	}
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE4NzA0NTk0NDEsLTQ3NzU4ODA1NCwtMT
IzNzQ4OTIyMyw5NzY1NDYxOTQsLTM4NDMyNTAxMiwtMjAyMzMz
MjQ1MSwxNjg2MTcxMjkzLC0xODkzMjg2NTgzXX0=
-->