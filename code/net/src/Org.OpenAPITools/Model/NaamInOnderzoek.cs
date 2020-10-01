/* 
 * Bevragen Ingeschreven Personen
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.0.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Geeft aan welke gegevens over de naam in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.0.0/features/in_onderzoek.feature) 
    /// </summary>
    [DataContract]
    public partial class NaamInOnderzoek :  IEquatable<NaamInOnderzoek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NaamInOnderzoek" /> class.
        /// </summary>
        /// <param name="geslachtsnaam">geslachtsnaam.</param>
        /// <param name="voornamen">voornamen.</param>
        /// <param name="voorvoegsel">voorvoegsel.</param>
        /// <param name="datumIngangOnderzoek">datumIngangOnderzoek.</param>
        public NaamInOnderzoek(bool geslachtsnaam = default(bool), bool voornamen = default(bool), bool voorvoegsel = default(bool), DatumOnvolledig datumIngangOnderzoek = default(DatumOnvolledig))
        {
            this.Geslachtsnaam = geslachtsnaam;
            this.Voornamen = voornamen;
            this.Voorvoegsel = voorvoegsel;
            this.DatumIngangOnderzoek = datumIngangOnderzoek;
        }
        
        /// <summary>
        /// Gets or Sets Geslachtsnaam
        /// </summary>
        [DataMember(Name="geslachtsnaam", EmitDefaultValue=false)]
        public bool Geslachtsnaam { get; set; }

        /// <summary>
        /// Gets or Sets Voornamen
        /// </summary>
        [DataMember(Name="voornamen", EmitDefaultValue=false)]
        public bool Voornamen { get; set; }

        /// <summary>
        /// Gets or Sets Voorvoegsel
        /// </summary>
        [DataMember(Name="voorvoegsel", EmitDefaultValue=false)]
        public bool Voorvoegsel { get; set; }

        /// <summary>
        /// Gets or Sets DatumIngangOnderzoek
        /// </summary>
        [DataMember(Name="datumIngangOnderzoek", EmitDefaultValue=false)]
        public DatumOnvolledig DatumIngangOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NaamInOnderzoek {\n");
            sb.Append("  Geslachtsnaam: ").Append(Geslachtsnaam).Append("\n");
            sb.Append("  Voornamen: ").Append(Voornamen).Append("\n");
            sb.Append("  Voorvoegsel: ").Append(Voorvoegsel).Append("\n");
            sb.Append("  DatumIngangOnderzoek: ").Append(DatumIngangOnderzoek).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as NaamInOnderzoek);
        }

        /// <summary>
        /// Returns true if NaamInOnderzoek instances are equal
        /// </summary>
        /// <param name="input">Instance of NaamInOnderzoek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NaamInOnderzoek input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Geslachtsnaam == input.Geslachtsnaam ||
                    (this.Geslachtsnaam != null &&
                    this.Geslachtsnaam.Equals(input.Geslachtsnaam))
                ) && 
                (
                    this.Voornamen == input.Voornamen ||
                    (this.Voornamen != null &&
                    this.Voornamen.Equals(input.Voornamen))
                ) && 
                (
                    this.Voorvoegsel == input.Voorvoegsel ||
                    (this.Voorvoegsel != null &&
                    this.Voorvoegsel.Equals(input.Voorvoegsel))
                ) && 
                (
                    this.DatumIngangOnderzoek == input.DatumIngangOnderzoek ||
                    (this.DatumIngangOnderzoek != null &&
                    this.DatumIngangOnderzoek.Equals(input.DatumIngangOnderzoek))
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
                if (this.Geslachtsnaam != null)
                    hashCode = hashCode * 59 + this.Geslachtsnaam.GetHashCode();
                if (this.Voornamen != null)
                    hashCode = hashCode * 59 + this.Voornamen.GetHashCode();
                if (this.Voorvoegsel != null)
                    hashCode = hashCode * 59 + this.Voorvoegsel.GetHashCode();
                if (this.DatumIngangOnderzoek != null)
                    hashCode = hashCode * 59 + this.DatumIngangOnderzoek.GetHashCode();
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
