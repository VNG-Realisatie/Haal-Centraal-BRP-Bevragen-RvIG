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
    /// Kiesrecht
    /// </summary>
    [DataContract(Name = "Kiesrecht")]
    public partial class Kiesrecht : IEquatable<Kiesrecht>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Kiesrecht" /> class.
        /// </summary>
        /// <param name="europeesKiesrecht">Geeft aan of persoon een oproep moet ontvangen voor verkiezingen voor het Europees parlement. .</param>
        /// <param name="uitgeslotenVanKiesrecht">uitgeslotenVanKiesrecht.</param>
        /// <param name="einddatumUitsluitingEuropeesKiesrecht">einddatumUitsluitingEuropeesKiesrecht.</param>
        /// <param name="einddatumUitsluitingKiesrecht">einddatumUitsluitingKiesrecht.</param>
        public Kiesrecht(bool europeesKiesrecht = default(bool), bool uitgeslotenVanKiesrecht = default(bool), DatumOnvolledig einddatumUitsluitingEuropeesKiesrecht = default(DatumOnvolledig), DatumOnvolledig einddatumUitsluitingKiesrecht = default(DatumOnvolledig))
        {
            this.EuropeesKiesrecht = europeesKiesrecht;
            this.UitgeslotenVanKiesrecht = uitgeslotenVanKiesrecht;
            this.EinddatumUitsluitingEuropeesKiesrecht = einddatumUitsluitingEuropeesKiesrecht;
            this.EinddatumUitsluitingKiesrecht = einddatumUitsluitingKiesrecht;
        }

        /// <summary>
        /// Geeft aan of persoon een oproep moet ontvangen voor verkiezingen voor het Europees parlement. 
        /// </summary>
        /// <value>Geeft aan of persoon een oproep moet ontvangen voor verkiezingen voor het Europees parlement. </value>
        [DataMember(Name = "europeesKiesrecht", EmitDefaultValue = false)]
        public bool EuropeesKiesrecht { get; set; }

        /// <summary>
        /// Gets or Sets UitgeslotenVanKiesrecht
        /// </summary>
        [DataMember(Name = "uitgeslotenVanKiesrecht", EmitDefaultValue = false)]
        public bool UitgeslotenVanKiesrecht { get; set; }

        /// <summary>
        /// Gets or Sets EinddatumUitsluitingEuropeesKiesrecht
        /// </summary>
        [DataMember(Name = "einddatumUitsluitingEuropeesKiesrecht", EmitDefaultValue = false)]
        public DatumOnvolledig EinddatumUitsluitingEuropeesKiesrecht { get; set; }

        /// <summary>
        /// Gets or Sets EinddatumUitsluitingKiesrecht
        /// </summary>
        [DataMember(Name = "einddatumUitsluitingKiesrecht", EmitDefaultValue = false)]
        public DatumOnvolledig EinddatumUitsluitingKiesrecht { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Kiesrecht {\n");
            sb.Append("  EuropeesKiesrecht: ").Append(EuropeesKiesrecht).Append("\n");
            sb.Append("  UitgeslotenVanKiesrecht: ").Append(UitgeslotenVanKiesrecht).Append("\n");
            sb.Append("  EinddatumUitsluitingEuropeesKiesrecht: ").Append(EinddatumUitsluitingEuropeesKiesrecht).Append("\n");
            sb.Append("  EinddatumUitsluitingKiesrecht: ").Append(EinddatumUitsluitingKiesrecht).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Kiesrecht);
        }

        /// <summary>
        /// Returns true if Kiesrecht instances are equal
        /// </summary>
        /// <param name="input">Instance of Kiesrecht to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Kiesrecht input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EuropeesKiesrecht == input.EuropeesKiesrecht ||
                    this.EuropeesKiesrecht.Equals(input.EuropeesKiesrecht)
                ) && 
                (
                    this.UitgeslotenVanKiesrecht == input.UitgeslotenVanKiesrecht ||
                    this.UitgeslotenVanKiesrecht.Equals(input.UitgeslotenVanKiesrecht)
                ) && 
                (
                    this.EinddatumUitsluitingEuropeesKiesrecht == input.EinddatumUitsluitingEuropeesKiesrecht ||
                    (this.EinddatumUitsluitingEuropeesKiesrecht != null &&
                    this.EinddatumUitsluitingEuropeesKiesrecht.Equals(input.EinddatumUitsluitingEuropeesKiesrecht))
                ) && 
                (
                    this.EinddatumUitsluitingKiesrecht == input.EinddatumUitsluitingKiesrecht ||
                    (this.EinddatumUitsluitingKiesrecht != null &&
                    this.EinddatumUitsluitingKiesrecht.Equals(input.EinddatumUitsluitingKiesrecht))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = hashCode * 59 + this.EuropeesKiesrecht.GetHashCode();
                hashCode = hashCode * 59 + this.UitgeslotenVanKiesrecht.GetHashCode();
                if (this.EinddatumUitsluitingEuropeesKiesrecht != null)
                    hashCode = hashCode * 59 + this.EinddatumUitsluitingEuropeesKiesrecht.GetHashCode();
                if (this.EinddatumUitsluitingKiesrecht != null)
                    hashCode = hashCode * 59 + this.EinddatumUitsluitingKiesrecht.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
