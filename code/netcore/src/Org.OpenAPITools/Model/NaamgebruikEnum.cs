/*
 * Bevragen Ingeschreven Personen RvIG
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.2.0/features) voor nadere toelichting.  De API zal door RvIG worden aangeboden. Daarin wordt een aantal afgeleide gegevens niet opgenomen. Daarom bevat deze specificatie minder gegevens dan de specificatie op [BRP-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/master/specificatie/genereervariant/openapi.yaml). 
 *
 * The version of the OpenAPI document: 1.2.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// De manier waarop de geslachtsnaam van persoon en partner van persoon moet worden verwerkt in de manier waarop persoon wil worden aangesproken * &#x60;eigen&#x60; - E - gebruik alleen de eigen naam * &#x60;eigen_partner&#x60; - N - gebruik de eigen naam voor de partnernaam * &#x60;partner&#x60; - P gebruik alleen de partnernaam * &#x60;partner_eigen&#x60; - V - gebruik de partnernaam voor de eigen naam.\&quot; 
    /// </summary>
    /// <value>De manier waarop de geslachtsnaam van persoon en partner van persoon moet worden verwerkt in de manier waarop persoon wil worden aangesproken * &#x60;eigen&#x60; - E - gebruik alleen de eigen naam * &#x60;eigen_partner&#x60; - N - gebruik de eigen naam voor de partnernaam * &#x60;partner&#x60; - P gebruik alleen de partnernaam * &#x60;partner_eigen&#x60; - V - gebruik de partnernaam voor de eigen naam.\&quot; </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum NaamgebruikEnum
    {
        /// <summary>
        /// Enum Eigen for value: eigen
        /// </summary>
        [EnumMember(Value = "eigen")]
        Eigen = 1,

        /// <summary>
        /// Enum EigenPartner for value: eigen_partner
        /// </summary>
        [EnumMember(Value = "eigen_partner")]
        EigenPartner = 2,

        /// <summary>
        /// Enum Partner for value: partner
        /// </summary>
        [EnumMember(Value = "partner")]
        Partner = 3,

        /// <summary>
        /// Enum PartnerEigen for value: partner_eigen
        /// </summary>
        [EnumMember(Value = "partner_eigen")]
        PartnerEigen = 4

    }

}
