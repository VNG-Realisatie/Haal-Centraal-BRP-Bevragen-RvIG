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
    /// Geeft aan om welke ouder het gaat volgens de BRP * &#x60;ouder1&#x60; - 1 * &#x60;ouder2&#x60; - 2 
    /// </summary>
    /// <value>Geeft aan om welke ouder het gaat volgens de BRP * &#x60;ouder1&#x60; - 1 * &#x60;ouder2&#x60; - 2 </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum OuderAanduidingEnum
    {
        /// <summary>
        /// Enum Ouder1 for value: ouder1
        /// </summary>
        [EnumMember(Value = "ouder1")]
        Ouder1 = 1,

        /// <summary>
        /// Enum Ouder2 for value: ouder2
        /// </summary>
        [EnumMember(Value = "ouder2")]
        Ouder2 = 2

    }

}
