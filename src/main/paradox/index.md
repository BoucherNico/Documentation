# Documentation

## Introduction

### Les formats de donnée

Les formats de données sont référencés dans la [documentation originale](https://help.salesforce.com/articleView?id=custom_field_types.thm&type=5).

### Les types d'enregistrement

Plusieurs objets fonctionnels peuvent être implémentés au sein d'un même objet applicatif. Salesforce permet de distinguer ces objets fonctionnels par l'intermédiaire de "types d'enregistrement". Chaque type d'enregistrement peut disposer de caractéristiques (d'un cycle de vie, de pages de présentation, de droits de consultation/création par profil, ...) indépendants des autres types d'enregistrement d'un même objet applicatif.

Pour enregistrer un objet avec un type d'enregistrement particulier, il faut le préciser dans les structures json. Voici un exemple de création de "Compte personnel" dans l'objet applicatif "Account" :

    POST
    /services/data/v42.0/sobjects/Account
    {
	    "FirstName" : "John",
	    "LastName" : "Doe",
	    "PersonEmail" : "john.doe@example.com",
	    "RecordType" : {
		    "attributes" : {
			    "type" : "RecordType"
			    },
			"Name" : "Compte personnel"
		}
    }

## Account

Un compte est une personne, physique ou morale, 

### Types d'enregistrement

|Type| Description |
|--|--|
| Partenaire | Partenaires producteurs de services |
| Compte personnel | Personnes physiques clientes de la PFS |
| Compte personnel Digiteam | Personnes physiques créées par la Digiteam |

## Order

### Types d'enregistrement

|Type| Description |
|--|--|

## OrderItem

### Types d'enregistrement

|Type| Description |
|--|--|

## Product2

## PriceBookEntry

## PriceBook

## Paiement__c

## Ligne_paiement__c

<!--stackedit_data:
eyJoaXN0b3J5IjpbMTYxNzcxNzg5OSwxNTQzNjAyNCwxMTA4MD
IwNjc0LDIxMjI5OTQxNzYsMTEwODAyMDY3NCwyMTIyOTk0MTc2
LDE2ODk1NjQwMTYsMTEwODAyMDY3NCwxMTA4MDIwNjc0LDE1Mz
IwMzM2ODUsMTYyNDcyMjIxNSwtMTk2MDkxMjc4MywtMTkyMzU5
MTIxNCwtMTkyMzU5MTIxNCwxOTQyMDU3MzA2XX0=
-->