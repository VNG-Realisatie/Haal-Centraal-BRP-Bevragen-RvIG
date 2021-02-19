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
    /// Redenen voor opschorting van de bijhouding * &#x60;overlijden&#x60; - O * &#x60;emigratie&#x60; - E * &#x60;ministerieel_besluit&#x60; - M * &#x60;pl_aangelegd_in_de_rni&#x60; - R - opgeschort omdat persoon is ingeschreven in het Register Niet Ingezeten (RNI). * &#x60;fout&#x60; - F 
    /// </summary>
    /// <value>Redenen voor opschorting van de bijhouding * &#x60;overlijden&#x60; - O * &#x60;emigratie&#x60; - E * &#x60;ministerieel_besluit&#x60; - M * &#x60;pl_aangelegd_in_de_rni&#x60; - R - opgeschort omdat persoon is ingeschreven in het Register Niet Ingezeten (RNI). * &#x60;fout&#x60; - F </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum RedenOpschortingBijhoudingEnum
    {
        /// <summary>
        /// Enum Overlijden for value: overlijden
        /// </summary>
        [EnumMember(Value = "overlijden")]
        Overlijden = 1,

        /// <summary>
        /// Enum Emigratie for value: emigratie
        /// </summary>
        [EnumMember(Value = "emigratie")]
        Emigratie = 2,

        /// <summary>
        /// Enum MinisterieelBesluit for value: ministerieel_besluit
        /// </summary>
        [EnumMember(Value = "ministerieel_besluit")]
        MinisterieelBesluit = 3,

        /// <summary>
        /// Enum PlAangelegdInDeRni for value: pl_aangelegd_in_de_rni
        /// </summary>
        [EnumMember(Value = "pl_aangelegd_in_de_rni")]
        PlAangelegdInDeRni = 4,

        /// <summary>
        /// Enum Fout for value: fout
        /// </summary>
        [EnumMember(Value = "fout")]
        Fout = 5

    }

}
