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
    /// IngeschrevenPersoonHal
    /// </summary>
    [DataContract]
    public partial class IngeschrevenPersoonHal :  IEquatable<IngeschrevenPersoonHal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IngeschrevenPersoonHal" /> class.
        /// </summary>
        /// <param name="burgerservicenummer">Het burgerservicenummer, bedoeld in artikel 1.1 van de Wet algemene bepalingen burgerservicenummer. Alle nummers waarvoor geldt dat, indien aangeduid als (s0 s1 s2 s3 s4 s5 s6 s7 s8), het resultaat van (9*s0) + (8*s1) + (7*s2) +...+ (2*s7) - (1*s8) deelbaar is door elf. Er moeten dus 9 cijfers aanwezig zijn..</param>
        /// <param name="geheimhoudingPersoonsgegevens">Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan..</param>
        /// <param name="geslachtsaanduiding">geslachtsaanduiding.</param>
        /// <param name="leeftijd">Leeftijd in jaren op het moment van bevraging.</param>
        /// <param name="datumEersteInschrijvingGBA">datumEersteInschrijvingGBA.</param>
        /// <param name="kiesrecht">kiesrecht.</param>
        /// <param name="naam">naam.</param>
        /// <param name="inOnderzoek">inOnderzoek.</param>
        /// <param name="nationaliteit">nationaliteit.</param>
        /// <param name="geboorte">geboorte.</param>
        /// <param name="opschortingBijhouding">opschortingBijhouding.</param>
        /// <param name="overlijden">overlijden.</param>
        /// <param name="verblijfplaats">verblijfplaats.</param>
        /// <param name="gezagsverhouding">gezagsverhouding.</param>
        /// <param name="verblijfstitel">verblijfstitel.</param>
        /// <param name="reisdocumenten">reisdocumenten.</param>
        /// <param name="links">links.</param>
        /// <param name="embedded">embedded.</param>
        public IngeschrevenPersoonHal(string burgerservicenummer = default(string), bool geheimhoudingPersoonsgegevens = default(bool), GeslachtEnum geslachtsaanduiding = default(GeslachtEnum), int leeftijd = default(int), DatumOnvolledig datumEersteInschrijvingGBA = default(DatumOnvolledig), Kiesrecht kiesrecht = default(Kiesrecht), NaamPersoon naam = default(NaamPersoon), PersoonInOnderzoek inOnderzoek = default(PersoonInOnderzoek), List<Nationaliteit> nationaliteit = default(List<Nationaliteit>), Geboorte geboorte = default(Geboorte), OpschortingBijhouding opschortingBijhouding = default(OpschortingBijhouding), Overlijden overlijden = default(Overlijden), Verblijfplaats verblijfplaats = default(Verblijfplaats), Gezagsverhouding gezagsverhouding = default(Gezagsverhouding), Verblijfstitel verblijfstitel = default(Verblijfstitel), List<string> reisdocumenten = default(List<string>), IngeschrevenPersoonLinks links = default(IngeschrevenPersoonLinks), IngeschrevenPersoonEmbedded embedded = default(IngeschrevenPersoonEmbedded))
        {
            this.Burgerservicenummer = burgerservicenummer;
            this.GeheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
            this.Geslachtsaanduiding = geslachtsaanduiding;
            this.Leeftijd = leeftijd;
            this.DatumEersteInschrijvingGBA = datumEersteInschrijvingGBA;
            this.Kiesrecht = kiesrecht;
            this.Naam = naam;
            this.InOnderzoek = inOnderzoek;
            this.Nationaliteit = nationaliteit;
            this.Geboorte = geboorte;
            this.OpschortingBijhouding = opschortingBijhouding;
            this.Overlijden = overlijden;
            this.Verblijfplaats = verblijfplaats;
            this.Gezagsverhouding = gezagsverhouding;
            this.Verblijfstitel = verblijfstitel;
            this.Reisdocumenten = reisdocumenten;
            this.Links = links;
            this.Embedded = embedded;
        }
        
        /// <summary>
        /// Het burgerservicenummer, bedoeld in artikel 1.1 van de Wet algemene bepalingen burgerservicenummer. Alle nummers waarvoor geldt dat, indien aangeduid als (s0 s1 s2 s3 s4 s5 s6 s7 s8), het resultaat van (9*s0) + (8*s1) + (7*s2) +...+ (2*s7) - (1*s8) deelbaar is door elf. Er moeten dus 9 cijfers aanwezig zijn.
        /// </summary>
        /// <value>Het burgerservicenummer, bedoeld in artikel 1.1 van de Wet algemene bepalingen burgerservicenummer. Alle nummers waarvoor geldt dat, indien aangeduid als (s0 s1 s2 s3 s4 s5 s6 s7 s8), het resultaat van (9*s0) + (8*s1) + (7*s2) +...+ (2*s7) - (1*s8) deelbaar is door elf. Er moeten dus 9 cijfers aanwezig zijn.</value>
        [DataMember(Name="burgerservicenummer", EmitDefaultValue=false)]
        public string Burgerservicenummer { get; set; }

        /// <summary>
        /// Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.
        /// </summary>
        /// <value>Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.</value>
        [DataMember(Name="geheimhoudingPersoonsgegevens", EmitDefaultValue=false)]
        public bool GeheimhoudingPersoonsgegevens { get; set; }

        /// <summary>
        /// Gets or Sets Geslachtsaanduiding
        /// </summary>
        [DataMember(Name="geslachtsaanduiding", EmitDefaultValue=false)]
        public GeslachtEnum Geslachtsaanduiding { get; set; }

        /// <summary>
        /// Leeftijd in jaren op het moment van bevraging
        /// </summary>
        /// <value>Leeftijd in jaren op het moment van bevraging</value>
        [DataMember(Name="leeftijd", EmitDefaultValue=false)]
        public int Leeftijd { get; set; }

        /// <summary>
        /// Gets or Sets DatumEersteInschrijvingGBA
        /// </summary>
        [DataMember(Name="datumEersteInschrijvingGBA", EmitDefaultValue=false)]
        public DatumOnvolledig DatumEersteInschrijvingGBA { get; set; }

        /// <summary>
        /// Gets or Sets Kiesrecht
        /// </summary>
        [DataMember(Name="kiesrecht", EmitDefaultValue=false)]
        public Kiesrecht Kiesrecht { get; set; }

        /// <summary>
        /// Gets or Sets Naam
        /// </summary>
        [DataMember(Name="naam", EmitDefaultValue=false)]
        public NaamPersoon Naam { get; set; }

        /// <summary>
        /// Gets or Sets InOnderzoek
        /// </summary>
        [DataMember(Name="inOnderzoek", EmitDefaultValue=false)]
        public PersoonInOnderzoek InOnderzoek { get; set; }

        /// <summary>
        /// Gets or Sets Nationaliteit
        /// </summary>
        [DataMember(Name="nationaliteit", EmitDefaultValue=false)]
        public List<Nationaliteit> Nationaliteit { get; set; }

        /// <summary>
        /// Gets or Sets Geboorte
        /// </summary>
        [DataMember(Name="geboorte", EmitDefaultValue=false)]
        public Geboorte Geboorte { get; set; }

        /// <summary>
        /// Gets or Sets OpschortingBijhouding
        /// </summary>
        [DataMember(Name="opschortingBijhouding", EmitDefaultValue=false)]
        public OpschortingBijhouding OpschortingBijhouding { get; set; }

        /// <summary>
        /// Gets or Sets Overlijden
        /// </summary>
        [DataMember(Name="overlijden", EmitDefaultValue=false)]
        public Overlijden Overlijden { get; set; }

        /// <summary>
        /// Gets or Sets Verblijfplaats
        /// </summary>
        [DataMember(Name="verblijfplaats", EmitDefaultValue=false)]
        public Verblijfplaats Verblijfplaats { get; set; }

        /// <summary>
        /// Gets or Sets Gezagsverhouding
        /// </summary>
        [DataMember(Name="gezagsverhouding", EmitDefaultValue=false)]
        public Gezagsverhouding Gezagsverhouding { get; set; }

        /// <summary>
        /// Gets or Sets Verblijfstitel
        /// </summary>
        [DataMember(Name="verblijfstitel", EmitDefaultValue=false)]
        public Verblijfstitel Verblijfstitel { get; set; }

        /// <summary>
        /// Gets or Sets Reisdocumenten
        /// </summary>
        [DataMember(Name="reisdocumenten", EmitDefaultValue=false)]
        public List<string> Reisdocumenten { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public IngeschrevenPersoonLinks Links { get; set; }

        /// <summary>
        /// Gets or Sets Embedded
        /// </summary>
        [DataMember(Name="_embedded", EmitDefaultValue=false)]
        public IngeschrevenPersoonEmbedded Embedded { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IngeschrevenPersoonHal {\n");
            sb.Append("  Burgerservicenummer: ").Append(Burgerservicenummer).Append("\n");
            sb.Append("  GeheimhoudingPersoonsgegevens: ").Append(GeheimhoudingPersoonsgegevens).Append("\n");
            sb.Append("  Geslachtsaanduiding: ").Append(Geslachtsaanduiding).Append("\n");
            sb.Append("  Leeftijd: ").Append(Leeftijd).Append("\n");
            sb.Append("  DatumEersteInschrijvingGBA: ").Append(DatumEersteInschrijvingGBA).Append("\n");
            sb.Append("  Kiesrecht: ").Append(Kiesrecht).Append("\n");
            sb.Append("  Naam: ").Append(Naam).Append("\n");
            sb.Append("  InOnderzoek: ").Append(InOnderzoek).Append("\n");
            sb.Append("  Nationaliteit: ").Append(Nationaliteit).Append("\n");
            sb.Append("  Geboorte: ").Append(Geboorte).Append("\n");
            sb.Append("  OpschortingBijhouding: ").Append(OpschortingBijhouding).Append("\n");
            sb.Append("  Overlijden: ").Append(Overlijden).Append("\n");
            sb.Append("  Verblijfplaats: ").Append(Verblijfplaats).Append("\n");
            sb.Append("  Gezagsverhouding: ").Append(Gezagsverhouding).Append("\n");
            sb.Append("  Verblijfstitel: ").Append(Verblijfstitel).Append("\n");
            sb.Append("  Reisdocumenten: ").Append(Reisdocumenten).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  Embedded: ").Append(Embedded).Append("\n");
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
            return this.Equals(input as IngeschrevenPersoonHal);
        }

        /// <summary>
        /// Returns true if IngeschrevenPersoonHal instances are equal
        /// </summary>
        /// <param name="input">Instance of IngeschrevenPersoonHal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IngeschrevenPersoonHal input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Burgerservicenummer == input.Burgerservicenummer ||
                    (this.Burgerservicenummer != null &&
                    this.Burgerservicenummer.Equals(input.Burgerservicenummer))
                ) && 
                (
                    this.GeheimhoudingPersoonsgegevens == input.GeheimhoudingPersoonsgegevens ||
                    this.GeheimhoudingPersoonsgegevens.Equals(input.GeheimhoudingPersoonsgegevens)
                ) && 
                (
                    this.Geslachtsaanduiding == input.Geslachtsaanduiding ||
                    (this.Geslachtsaanduiding != null &&
                    this.Geslachtsaanduiding.Equals(input.Geslachtsaanduiding))
                ) && 
                (
                    this.Leeftijd == input.Leeftijd ||
                    this.Leeftijd.Equals(input.Leeftijd)
                ) && 
                (
                    this.DatumEersteInschrijvingGBA == input.DatumEersteInschrijvingGBA ||
                    (this.DatumEersteInschrijvingGBA != null &&
                    this.DatumEersteInschrijvingGBA.Equals(input.DatumEersteInschrijvingGBA))
                ) && 
                (
                    this.Kiesrecht == input.Kiesrecht ||
                    (this.Kiesrecht != null &&
                    this.Kiesrecht.Equals(input.Kiesrecht))
                ) && 
                (
                    this.Naam == input.Naam ||
                    (this.Naam != null &&
                    this.Naam.Equals(input.Naam))
                ) && 
                (
                    this.InOnderzoek == input.InOnderzoek ||
                    (this.InOnderzoek != null &&
                    this.InOnderzoek.Equals(input.InOnderzoek))
                ) && 
                (
                    this.Nationaliteit == input.Nationaliteit ||
                    this.Nationaliteit != null &&
                    input.Nationaliteit != null &&
                    this.Nationaliteit.SequenceEqual(input.Nationaliteit)
                ) && 
                (
                    this.Geboorte == input.Geboorte ||
                    (this.Geboorte != null &&
                    this.Geboorte.Equals(input.Geboorte))
                ) && 
                (
                    this.OpschortingBijhouding == input.OpschortingBijhouding ||
                    (this.OpschortingBijhouding != null &&
                    this.OpschortingBijhouding.Equals(input.OpschortingBijhouding))
                ) && 
                (
                    this.Overlijden == input.Overlijden ||
                    (this.Overlijden != null &&
                    this.Overlijden.Equals(input.Overlijden))
                ) && 
                (
                    this.Verblijfplaats == input.Verblijfplaats ||
                    (this.Verblijfplaats != null &&
                    this.Verblijfplaats.Equals(input.Verblijfplaats))
                ) && 
                (
                    this.Gezagsverhouding == input.Gezagsverhouding ||
                    (this.Gezagsverhouding != null &&
                    this.Gezagsverhouding.Equals(input.Gezagsverhouding))
                ) && 
                (
                    this.Verblijfstitel == input.Verblijfstitel ||
                    (this.Verblijfstitel != null &&
                    this.Verblijfstitel.Equals(input.Verblijfstitel))
                ) && 
                (
                    this.Reisdocumenten == input.Reisdocumenten ||
                    this.Reisdocumenten != null &&
                    input.Reisdocumenten != null &&
                    this.Reisdocumenten.SequenceEqual(input.Reisdocumenten)
                ) && 
                (
                    this.Links == input.Links ||
                    (this.Links != null &&
                    this.Links.Equals(input.Links))
                ) && 
                (
                    this.Embedded == input.Embedded ||
                    (this.Embedded != null &&
                    this.Embedded.Equals(input.Embedded))
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
                if (this.Burgerservicenummer != null)
                    hashCode = hashCode * 59 + this.Burgerservicenummer.GetHashCode();
                hashCode = hashCode * 59 + this.GeheimhoudingPersoonsgegevens.GetHashCode();
                if (this.Geslachtsaanduiding != null)
                    hashCode = hashCode * 59 + this.Geslachtsaanduiding.GetHashCode();
                hashCode = hashCode * 59 + this.Leeftijd.GetHashCode();
                if (this.DatumEersteInschrijvingGBA != null)
                    hashCode = hashCode * 59 + this.DatumEersteInschrijvingGBA.GetHashCode();
                if (this.Kiesrecht != null)
                    hashCode = hashCode * 59 + this.Kiesrecht.GetHashCode();
                if (this.Naam != null)
                    hashCode = hashCode * 59 + this.Naam.GetHashCode();
                if (this.InOnderzoek != null)
                    hashCode = hashCode * 59 + this.InOnderzoek.GetHashCode();
                if (this.Nationaliteit != null)
                    hashCode = hashCode * 59 + this.Nationaliteit.GetHashCode();
                if (this.Geboorte != null)
                    hashCode = hashCode * 59 + this.Geboorte.GetHashCode();
                if (this.OpschortingBijhouding != null)
                    hashCode = hashCode * 59 + this.OpschortingBijhouding.GetHashCode();
                if (this.Overlijden != null)
                    hashCode = hashCode * 59 + this.Overlijden.GetHashCode();
                if (this.Verblijfplaats != null)
                    hashCode = hashCode * 59 + this.Verblijfplaats.GetHashCode();
                if (this.Gezagsverhouding != null)
                    hashCode = hashCode * 59 + this.Gezagsverhouding.GetHashCode();
                if (this.Verblijfstitel != null)
                    hashCode = hashCode * 59 + this.Verblijfstitel.GetHashCode();
                if (this.Reisdocumenten != null)
                    hashCode = hashCode * 59 + this.Reisdocumenten.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
                if (this.Embedded != null)
                    hashCode = hashCode * 59 + this.Embedded.GetHashCode();
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
            // Burgerservicenummer (string) maxLength
            if(this.Burgerservicenummer != null && this.Burgerservicenummer.Length > 9)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Burgerservicenummer, length must be less than 9.", new [] { "Burgerservicenummer" });
            }

            // Burgerservicenummer (string) minLength
            if(this.Burgerservicenummer != null && this.Burgerservicenummer.Length < 9)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Burgerservicenummer, length must be greater than 9.", new [] { "Burgerservicenummer" });
            }

            // Burgerservicenummer (string) pattern
            Regex regexBurgerservicenummer = new Regex(@"^[0-9]*$", RegexOptions.CultureInvariant);
            if (false == regexBurgerservicenummer.Match(this.Burgerservicenummer).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Burgerservicenummer, must match a pattern of " + regexBurgerservicenummer, new [] { "Burgerservicenummer" });
            }

            // Leeftijd (int) maximum
            if(this.Leeftijd > (int)999)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Leeftijd, must be a value less than or equal to 999.", new [] { "Leeftijd" });
            }

            yield break;
        }
    }

}
