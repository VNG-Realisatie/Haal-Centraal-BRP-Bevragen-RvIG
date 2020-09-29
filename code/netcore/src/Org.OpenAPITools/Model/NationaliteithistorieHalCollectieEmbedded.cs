/* 
 * Bevragingen ingeschreven personen
 *
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
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
    /// NationaliteithistorieHalCollectieEmbedded
    /// </summary>
    [DataContract]
    public partial class NationaliteithistorieHalCollectieEmbedded :  IEquatable<NationaliteithistorieHalCollectieEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NationaliteithistorieHalCollectieEmbedded" /> class.
        /// </summary>
        /// <param name="nationaliteithistorie">nationaliteithistorie.</param>
        public NationaliteithistorieHalCollectieEmbedded(List<Nationaliteithistorie> nationaliteithistorie = default(List<Nationaliteithistorie>))
        {
            this.Nationaliteithistorie = nationaliteithistorie;
        }
        
        /// <summary>
        /// Gets or Sets Nationaliteithistorie
        /// </summary>
        [DataMember(Name="nationaliteithistorie", EmitDefaultValue=false)]
        public List<Nationaliteithistorie> Nationaliteithistorie { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NationaliteithistorieHalCollectieEmbedded {\n");
            sb.Append("  Nationaliteithistorie: ").Append(Nationaliteithistorie).Append("\n");
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
            return this.Equals(input as NationaliteithistorieHalCollectieEmbedded);
        }

        /// <summary>
        /// Returns true if NationaliteithistorieHalCollectieEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of NationaliteithistorieHalCollectieEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NationaliteithistorieHalCollectieEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Nationaliteithistorie == input.Nationaliteithistorie ||
                    this.Nationaliteithistorie != null &&
                    input.Nationaliteithistorie != null &&
                    this.Nationaliteithistorie.SequenceEqual(input.Nationaliteithistorie)
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
                if (this.Nationaliteithistorie != null)
                    hashCode = hashCode * 59 + this.Nationaliteithistorie.GetHashCode();
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
