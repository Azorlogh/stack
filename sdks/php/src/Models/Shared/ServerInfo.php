<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace formance\stack\Models\Shared;


/**
 * ServerInfo - Server information
 * 
 * @package formance\stack\Models\Shared
 * @access public
 */
class ServerInfo
{
	#[\JMS\Serializer\Annotation\SerializedName('version')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $version;
    
	public function __construct()
	{
		$this->version = "";
	}
}
