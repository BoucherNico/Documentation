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

## Account (Compte)

Un compte est une personne, physique ou morale, en relation avec la plateforme de service.

### Types d'enregistrement

|Type| Description |
|--|--|
| Partenaire | Partenaires producteurs de services |
| Compte personnel | Personnes physiques clientes de la PFS |
| Compte personnel Digiteam | Personnes physiques créées par la Digiteam |

## Order (Commande)

### Types d'enregistrement

|Type| Description |
|--|--|

## OrderItem (Service Commandé)

### Types d'enregistrement

|Type| Description |
|--|--|

## Product2 (Service)

## PriceBookEntry (Entrée de Catalogue de Prix)

## PriceBook (Catalogue de Prix)

## Paiement__c (Paiement)

## Ligne_paiement__c (Ligne de Paiement)

<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE5OTY0NTQ1MzEsLTIxMDU3MTQ4ODUsLT
E4ODAyMDYxNzksMTU0MzYwMjQsMTEwODAyMDY3NCwyMTIyOTk0
MTc2LDExMDgwMjA2NzQsMjEyMjk5NDE3NiwxNjg5NTY0MDE2LD
ExMDgwMjA2NzQsMTUzMjAzMzY4NSwxNjI0NzIyMjE1LC0xOTYw
OTEyNzgzLC0xOTIzNTkxMjE0LC0xOTIzNTkxMjE0LDE5NDIwNT
czMDZdfQ==
-->