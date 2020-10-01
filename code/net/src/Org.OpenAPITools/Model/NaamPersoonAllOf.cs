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
    /// NaamPersoonAllOf
    /// </summary>
    [DataContract]
    public partial class NaamPersoonAllOf :  IEquatable<NaamPersoonAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NaamPersoonAllOf" /> class.
        /// </summary>
        /// <param name="aanhef">Kun je gebruiken als aanhef in een brief gericht aan persoon. .</param>
        /// <param name="aanschrijfwijze">Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. .</param>
        /// <param name="gebruikInLopendeTekst">Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. .</param>
        /// <param name="aanduidingNaamgebruik">aanduidingNaamgebruik.</param>
        public NaamPersoonAllOf(string aanhef = default(string), string aanschrijfwijze = default(string), string gebruikInLopendeTekst = default(string), NaamgebruikEnum aanduidingNaamgebruik = default(NaamgebruikEnum))
        {
            this.Aanhef = aanhef;
            this.Aanschrijfwijze = aanschrijfwijze;
            this.GebruikInLopendeTekst = gebruikInLopendeTekst;
            this.AanduidingNaamgebruik = aanduidingNaamgebruik;
        }
        
        /// <summary>
        /// Kun je gebruiken als aanhef in een brief gericht aan persoon. 
        /// </summary>
        /// <value>Kun je gebruiken als aanhef in een brief gericht aan persoon. </value>
        [DataMember(Name="aanhef", EmitDefaultValue=false)]
        public string Aanhef { get; set; }

        /// <summary>
        /// Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. 
        /// </summary>
        /// <value>Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. </value>
        [DataMember(Name="aanschrijfwijze", EmitDefaultValue=false)]
        public string Aanschrijfwijze { get; set; }

        /// <summary>
        /// Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. 
        /// </summary>
        /// <value>Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. </value>
        [DataMember(Name="gebruikInLopendeTekst", EmitDefaultValue=false)]
        public string GebruikInLopendeTekst { get; set; }

        /// <summary>
        /// Gets or Sets AanduidingNaamgebruik
        /// </summary>
        [DataMember(Name="aanduidingNaamgebruik", EmitDefaultValue=false)]
        public NaamgebruikEnum AanduidingNaamgebruik { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NaamPersoonAllOf {\n");
            sb.Append("  Aanhef: ").Append(Aanhef).Append("\n");
            sb.Append("  Aanschrijfwijze: ").Append(Aanschrijfwijze).Append("\n");
            sb.Append("  GebruikInLopendeTekst: ").Append(GebruikInLopendeTekst).Append("\n");
            sb.Append("  AanduidingNaamgebruik: ").Append(AanduidingNaamgebruik).Append("\n");
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
            return this.Equals(input as NaamPersoonAllOf);
        }

        /// <summary>
        /// Returns true if NaamPersoonAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of NaamPersoonAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NaamPersoonAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Aanhef == input.Aanhef ||
                    (this.Aanhef != null &&
                    this.Aanhef.Equals(input.Aanhef))
                ) && 
                (
                    this.Aanschrijfwijze == input.Aanschrijfwijze ||
                    (this.Aanschrijfwijze != null &&
                    this.Aanschrijfwijze.Equals(input.Aanschrijfwijze))
                ) && 
                (
                    this.GebruikInLopendeTekst == input.GebruikInLopendeTekst ||
                    (this.GebruikInLopendeTekst != null &&
                    this.GebruikInLopendeTekst.Equals(input.GebruikInLopendeTekst))
                ) && 
                (
                    this.AanduidingNaamgebruik == input.AanduidingNaamgebruik ||
                    (this.AanduidingNaamgebruik != null &&
                    this.AanduidingNaamgebruik.Equals(input.AanduidingNaamgebruik))
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
                if (this.Aanhef != null)
                    hashCode = hashCode * 59 + this.Aanhef.GetHashCode();
                if (this.Aanschrijfwijze != null)
                    hashCode = hashCode * 59 + this.Aanschrijfwijze.GetHashCode();
                if (this.GebruikInLopendeTekst != null)
                    hashCode = hashCode * 59 + this.GebruikInLopendeTekst.GetHashCode();
                if (this.AanduidingNaamgebruik != null)
                    hashCode = hashCode * 59 + this.AanduidingNaamgebruik.GetHashCode();
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
