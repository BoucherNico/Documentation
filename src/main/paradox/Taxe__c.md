# Taxe (Taxe__c)

Une taxe est un prélèvement obligatoire perçu d'autorité à l'occasion d'un service rendu.

## Types d'enregistrement

|Type| Description |
|--|--|
| Standard | Il n'y a pas de type de taxe autre que la TVA |

## Champs

| API Name | Etiquette | Type | Description |
|--|--|--|--|
| Id |  |  | Identifiant technique de l'enregistrement (variable selon les environnements) |
| Name | Nom de la Taxe | String(80) | Nom de la Taxe |
| Taux__c | Taux | Percent | Taux de la Taxe |

Voici un exemple au format JSON de
    {
		"attributes" : {
		    "type" : "Taxe__c",
		    "url" : "/services/data/v43.0/sobjects/Taxe__c/a086E000001tGGLQA2"
		},
		"Id" : "a086E000001tGGLQA2",
		"OwnerId" : "0050Y000003BnD6QAK",
		"IsDeleted" : false,
		"Name" : "TVA : 10 %",
		"CreatedDate" : "2018-05-14T13:11:03.000+0000",
		"CreatedById" : "0050Y000003BnD6QAK",
		"LastModifiedDate" : "2018-05-14T13:11:03.000+0000",
		"LastModifiedById" : "0050Y000003BnD6QAK",
		"Taux__c" : 10.0
	}

## Relations
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTI3MjQxNzc3OSwtNDE1Nzg2NTU2LDEzOT
QwMzU4NDddfQ==
-->